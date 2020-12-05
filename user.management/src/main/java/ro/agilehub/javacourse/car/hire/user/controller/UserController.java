package ro.agilehub.javacourse.car.hire.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UsersApi;
import ro.agilehub.javacourse.car.hire.user.controller.mapper.UserDTOMapper;
import ro.agilehub.javacourse.car.hire.user.service.UserServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController implements UsersApi {

    @Autowired
    UserServiceImpl userServiceImpl;

    @Autowired
    UserDTOMapper userDTOMapper;

    @GetMapping()
    public ResponseEntity<List<UserDTO>> getUsers() {
        var userList = userServiceImpl.findAll();
        return ResponseEntity.ok(userList.stream().map(
                userDTOMapper::returnDTO
                ).collect(Collectors.toList())
        );
    }

    @GetMapping(value = "{/id}")
    public ResponseEntity getById(@PathVariable("id") String id){
        var findById = userServiceImpl.findById(id);
        return ResponseEntity.ok(findById.getId()

        );
    }

    public ResponseEntity<UserDTO> addUser() {

        return null;
    }
}

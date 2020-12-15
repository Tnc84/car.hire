package ro.agilehub.javacourse.car.hire.user.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UsersApi;
import ro.agilehub.javacourse.car.hire.user.controller.mapper.UserDTOMapper;
import ro.agilehub.javacourse.car.hire.user.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController implements UsersApi {

    @Autowired
    UserService userService;
    @Autowired
    UserDTOMapper userDTOMapper;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getUsers() {
        var getUser = userService.findAllUsers();
        return ResponseEntity.ok(getUser
                .stream()
                .map(userDTOMapper::toUserDTO)
                .collect(Collectors.toList()));

//        return ResponseEntity.ok(userDTOMapper.toUserDTOList(userService.findAllUsers()));

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") Integer id) {
        UserDTO findUser = userDTOMapper.toUserDTO(userService.findById(id));
        return ResponseEntity.ok(findUser);

//        return ResponseEntity.ok(userDTOMapper.toUserDTO(userService.findById(id)));
    }

//    @PostMapping(value = "addUser")
//    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
//        var addUsers = userDTOMapper.toNewDomain(userDTO);
//        return ResponseEntity.ok(addUsers);
//    }
}


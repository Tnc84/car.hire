package ro.agilehub.javacourse.car.hire.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UsersApi;
import ro.agilehub.javacourse.car.hire.user.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController implements UsersApi {

    @Autowired
    UserService userService;

    @Override
    @GetMapping()
    public ResponseEntity<List<UserDTO>> getUsers() {
        var userList = userService.findAll();
        return ResponseEntity.ok(userList.stream().map(users -> {
                    var getAllUsers = new UserDTO();
                    getAllUsers.setId(getAllUsers.getId());
                    getAllUsers.setUserName(getAllUsers.getUserName());
                    getAllUsers.setCountry(getAllUsers.getCountry());
                    return getAllUsers;
                }).collect(Collectors.toList())
        );
    }

    public ResponseEntity<UserDTO> addUser(){

        return null;
    }

//    @Override
//    @GetMapping()
//    public ResponseEntity<List<UserDTO>> getUsers() {
//        var getAllUsers = userService.findAll();
//        return ResponseEntity.ok(userService.findAll()
//                .stream()
//                .map(user -> { userMappingFunction((User) getAllUsers)})
//                .collect(Collectors.toList()));
//    }
//
//    private UserDTO userMappingFunction(User user) {
//        var getAllUsers = new UserDTO();
//        getAllUsers.setId(getAllUsers.getId());
//        getAllUsers.setUserName(getAllUsers.getUserName());
//        getAllUsers.setCountry(getAllUsers.getCountry());
//        return getAllUsers;
//    }
}

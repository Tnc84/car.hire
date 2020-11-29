package ro.agilehub.javacourse.car.hire.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UsersApi;
import ro.agilehub.javacourse.car.hire.user.service.UserService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController implements UsersApi {

    @Autowired
    UserService userService;

    @Override
    @GetMapping()
    public ResponseEntity<List<UserDTO>> getUsers() {
        var getUsers = userService.findAll();
        return ResponseEntity.ok(getUsers.stream().map(userEntity -> {
            var result = new UserDTO();
            result.setId(userEntity.getId());
            result.setUsername(userEntity.getUserName());
            result.setCountry(userEntity.getCountry().getName());
            return result;
        }).collect(Collectors.toList()));
    }

    @Override
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getUserById(Integer id) {
        return ResponseEntity.ok(buildDummyUser());
    }

    @Override
    @PostMapping("/add")
    public ResponseEntity<UserDTO> addUser(@Valid UserDTO userDTO) {
        return ResponseEntity.ok(buildDummyUser());
    }

    //    @Override
    @PatchMapping
    public ResponseEntity<UserDTO> patchUser(@Valid UserDTO userDTO) {
        return ResponseEntity.ok(buildDummyUser());
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<UserDTO> deleteUser(Integer id) {
        return ResponseEntity.ok(null);
    }


    private UserDTO buildDummyUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setUsername("My first sample");
        return userDTO;
    }
}

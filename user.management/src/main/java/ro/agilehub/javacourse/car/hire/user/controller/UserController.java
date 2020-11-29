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
        var user = userService.findAll();
        return ResponseEntity.ok(user.stream().map(users -> {
                    var getAllUsers = new UserDTO();
                    getAllUsers.setId(getAllUsers.getId());
                    getAllUsers.setUserName(getAllUsers.getUserName());
                    getAllUsers.setCountry(getAllUsers.getCountry());
                    return getAllUsers;
                }).collect(Collectors.toList())
        );
    }

    @Override
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id) {
        var userDTO = new UserDTO();
        if (userDTO.getId().equals(id)) {
            userService.findById(id);
        }
        return ResponseEntity.ok(userDTO);
    }

    @Override
    @PostMapping("/add")
    public ResponseEntity<UserDTO> addUser(@Valid UserDTO userDTO) {
        var user = userService.addUser();
        return ResponseEntity.ok(user.stream().map(users -> {
                    var getNewUsers = new UserDTO();
                    getNewUsers.setId(getNewUsers.getId());
                    getNewUsers.setFirstName(getNewUsers.getFirstName());
                    getNewUsers.setLastName(getNewUsers.getLastName());
                    getNewUsers.setUserName(getNewUsers.getUserName());
                    getNewUsers.setEmail(getNewUsers.getEmail());
                    getNewUsers.setDriverLicenseNo(getNewUsers.getDriverLicenseNo());
                    getNewUsers.setPassword(getNewUsers.getPassword());
                    getNewUsers.setCountry(getNewUsers.getCountry());
                    return;
                }).collect(Collectors.toList())
        );
    }

    @Override
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
        userDTO.setUserName("My first sample");
        return userDTO;
    }
}

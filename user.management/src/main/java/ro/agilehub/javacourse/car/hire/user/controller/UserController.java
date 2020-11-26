package ro.agilehub.javacourse.car.hire.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UsersApi;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
public class UserController implements UsersApi {



       @Override
    public ResponseEntity<List<UserDTO>> getUsers() {
        return ResponseEntity.ok(Collections.singletonList(buildDummyUser()));
    }

    @Override
    public ResponseEntity<UserDTO> addUser(@Valid UserDTO userDTO) {
        return ResponseEntity.ok(buildDummyUser());
    }

    @Override
    public ResponseEntity<UserDTO> deleteUser(Integer id) {
        return ResponseEntity.ok(null);
    }

    @Override
    public ResponseEntity<UserDTO> getUserById(Integer id) {
        return ResponseEntity.ok(buildDummyUser());
    }

//    @Override
    public ResponseEntity<UserDTO> patchUser(@Valid UserDTO userDTO) {
        return ResponseEntity.ok(buildDummyUser());
    }

    private UserDTO buildDummyUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setUsername("My first sample");
        return userDTO;
    }
}

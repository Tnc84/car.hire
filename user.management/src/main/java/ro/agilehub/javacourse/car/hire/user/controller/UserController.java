package ro.agilehub.javacourse.car.hire.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ro.agilehub.javacourse.car.hire.api.model.CreatedDTO;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UsersApi;
import ro.agilehub.javacourse.car.hire.user.controller.mapper.UserDTOMapper;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.UserDomain;
import ro.agilehub.javacourse.car.hire.user.service.userService.UserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@PreAuthorize("hasAuthority('MANAGER')")
@RequiredArgsConstructor
public class UserController implements UsersApi {

    private final UserService userService;
    private final UserDTOMapper userDTOMapper;

    @GetMapping(value = "/users")
    public ResponseEntity<List<UserDTO>> getUsers() {
        var getUser = userService.findAllUsers();
        return ResponseEntity.ok(userDTOMapper.toUserDTOList(userService.findAllUsers()));

    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userDTOMapper.toUserDTO(userService.getById(id)));
    }

    @Override
    @PostMapping(value = "/add")
    public ResponseEntity<CreatedDTO> addUser(@Valid UserDTO userDTO) {
        UserDomain userDO = userDTOMapper.toNewUserDO(userDTO);
        Integer newUserId = userService.createNewUser(userDO);
        CreatedDTO createdDTO = new CreatedDTO();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdDTO.id(newUserId));
    }

    @Override
    @PatchMapping(value = "/update")
    public ResponseEntity<Void> patchUser(Integer id, @Valid UserDTO userDTO) {
        userService.patchUser(id, userDTOMapper.toUserDomain(userDTO));
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    @DeleteMapping
    public ResponseEntity<Void> deleteUser(Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}


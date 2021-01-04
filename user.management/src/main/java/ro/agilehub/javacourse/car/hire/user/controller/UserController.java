package ro.agilehub.javacourse.car.hire.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.CreatedDTO;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UsersApi;
import ro.agilehub.javacourse.car.hire.user.controller.mapper.UserDTOMapper;
import ro.agilehub.javacourse.car.hire.user.service.UserService;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAuthority('MANAGER')")
@RequiredArgsConstructor
public class UserController implements UsersApi {

    private final UserService userService;
    private final UserDTOMapper userDTOMapper;

    @GetMapping(value = "/users")
    public ResponseEntity<List<UserDTO>> getUsers() {
        var getUser = userService.findAllUsers();
        return ResponseEntity.ok(getUser
                .stream()
                .map(userDTOMapper::toUserDTO)
                .collect(Collectors.toList()));

//        return ResponseEntity.ok(userDTOMapper.toUserDTOList(userService.findAllUsers()));

    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") Integer id) {
        UserDTO findUser = userDTOMapper.toUserDTO(userService.getById(id));
        return ResponseEntity.ok(findUser);

//        return ResponseEntity.ok(userDTOMapper.toUserDTO(userService.findById(id)));
    }

    @Override
    public ResponseEntity<CreatedDTO> addUser(@Valid UserDTO userDTO) {
        UserDomain userDO = userDTOMapper.toNewUserDO(userDTO);
        Integer newUserId = userService.createNewUser(userDO);
        CreatedDTO createdDTO = new CreatedDTO();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdDTO.id(newUserId));
    }

    @Override
    public ResponseEntity<Void> patchUser(Integer id, @Valid UserDTO userDTO) {
        userService.patchUser(id, userDTOMapper.toUserDomain(userDTO));
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    public ResponseEntity<UserDTO> deleteUser(Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}


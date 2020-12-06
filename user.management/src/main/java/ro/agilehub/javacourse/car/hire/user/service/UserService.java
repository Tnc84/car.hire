package ro.agilehub.javacourse.car.hire.user.service;

import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

import java.util.List;

public interface UserService {

    List<UserDomain> findAll();

    UserDomain findById(String id);

    UserDTO addUser(User user);

}

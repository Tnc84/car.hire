package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

import java.util.List;

@Service
public interface UserService {

    List<UserDomain> findAll();

    UserDomain findById(Integer id);

    UserDTO addUser(User user);

}

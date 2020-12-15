package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

import java.util.List;

@Service
public interface UserService {

    List<UserDomain> findAllUsers();

    UserDomain findById(Integer id);

    int addUser(UserDomain UserDomain);

    void patchUser(Integer id, UserDomain updateExample);

    void deleteUser(Integer id);
}

package ro.agilehub.javacourse.car.hire.user.service.userService;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.UserDomain;

import java.util.List;

@Service
public interface UserService {

    List<UserDomain> findAllUsers();

    Integer createNewUser(UserDomain example);

    UserDomain getById(Integer id);

    void patchUser(Integer id, UserDomain updateExample);

    void deleteUser(Integer id);

    UserDomain getByUsername(String username);
}

package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.entity.User;

import java.util.List;

@Service
public interface UserService {

    User addUser();

    List<User> findAll();

    User findById(Integer id);

    void delete(Integer id);

    User patch(Integer id);

}

package ro.agilehub.javacourse.car.hire.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.repository.UserRepository;
import ro.agilehub.javacourse.car.hire.user.service.UserService;
import ro.agilehub.javacourse.car.hire.user.service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllerForUserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @GetMapping(value = "/{id}")
    public User findById(Integer id) {
        return userRepository.getOne(id);
    }
}

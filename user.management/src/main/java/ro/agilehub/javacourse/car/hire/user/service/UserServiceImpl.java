package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser() {
        User user1 = new User();
        user1.setFirstName(user1.getFirstName());
        user1.setLastName(user1.getLastName());
        user1.setUserName(user1.getUserName());
        user1.setPassword(user1.getPassword());
        user1.setEmail(user1.getEmail());
        user1.setCountry(user1.getCountry());
        user1.setDriverLicense(user1.getDriverLicense());
        userRepository.save(user1);
        return user1;
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/findAll/{id}")
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        userRepository.delete(userRepository.getOne(id));
    }

    @Override
    public User patch(Integer id) {
        User user1 = new User();
        user1.setFirstName(user1.getFirstName());
        user1.setLastName(user1.getLastName());
        user1.setUserName(user1.getUserName());
        user1.setPassword(user1.getPassword());
        user1.setEmail(user1.getEmail());
        user1.setCountry(user1.getCountry());
        user1.setDriverLicense(user1.getDriverLicense());
        userRepository.save(user1);
        return user1;
    }
}





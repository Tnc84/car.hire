package ro.agilehub.javacourse.car.hire.user.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.repository.CountryRepository;
import ro.agilehub.javacourse.car.hire.user.repository.UserRepository;
import ro.agilehub.javacourse.car.hire.user.service.mapper.UserMapper;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<UserDomain> findAll() {
        var users = userRepository.findAll();
        return users
                .stream()
                .map(userMapper::toDomain)
                .collect(Collectors.toList());
    }

//    @Override
//    public UserDomain findById(String id) {
//        var findId = new UserDomain();
//        return userRepository.findById(new ObjectId(String.valueOf(user.getId())))
//                .map(userMapper::returnUserDomain)
//                .orElseThrow();
//    }

    @Override
    public UserDTO addUser(User user) {
        return null;
    }

    @Override
    public UserDomain findById(String id) {
        var user =  userRepository.findById(new ObjectId(id));
        return  user
                .map(this::map)
                .orElseThrow();
    }

    private UserDomain map(User user) {
        var country = countryRepository
                .findById(new ObjectId(String.valueOf(user.getCountry())))
                .orElse(null);
        return userMapper.toDomain(user);
    }
}





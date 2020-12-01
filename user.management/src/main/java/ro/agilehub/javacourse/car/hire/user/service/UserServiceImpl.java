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
    CountryRepository countryRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserDomain> findAll() {
        return userRepository.findAll()
                .stream()
                .map(this::map)
                .collect(Collectors.toList());
    }

    @Override
    public UserDomain findById(Integer id) {
        return userRepository.findById(new ObjectId(String.valueOf(id)))
                .map(this::map)
                .orElseThrow();
    }

    @Override
    public UserDTO addUser(User user) {
        return null;
    }

    private UserDomain map(User user) {
        var country = countryRepository
                .findById(new ObjectId(String.valueOf(user.getCountry())))
                .orElse(null);
        return userMapper.toDomainObject(user, country);
    }
}





package ro.agilehub.javacourse.car.hire.user.service.userService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.repository.definition.UserRepository;
import ro.agilehub.javacourse.car.hire.user.repository.entity.User;
import ro.agilehub.javacourse.car.hire.user.repository.entity.UserEnum;
import ro.agilehub.javacourse.car.hire.user.service.mapper.UserDomainMapper;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.UserDomain;
import ro.agilehub.javacourse.car.hire.user.service.validator.UserServiceValidator;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserDomainMapper userDomainMapper;
    @Autowired
    UserServiceValidator userServiceValidator;

    @Override
    public List<UserDomain> findAllUsers() {
        var findUsers = userDomainMapper.toUserDomainList(userRepository.findAll());
        if (findUsers.isEmpty()) {
            throw new NoSuchElementException();
        }
        return findUsers;
    }

    @Override
    public UserDomain getById(Integer id) {
        return userDomainMapper.toDomain(userRepository.getOne(id));
    }

    @Override
    public Integer createNewUser(UserDomain userDomain) {
        var addUser = userDomainMapper.toUser(userDomain);
        addUser = userRepository.save(addUser);
        return addUser.getId();
    }


    @Override
    public void patchUser(Integer id, UserDomain updateExample) {
        User user = userRepository.getOne(id);
        userDomainMapper.patchUser(updateExample, user);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        User user = userRepository.getOne(id);
        user.setStatus(UserEnum.DENIED);
        userRepository.save(user);
    }

    @Override
    public UserDomain getByUsername(String userName) {
        return userDomainMapper.toDomain(userRepository.findByUserNameIgnoreCase(userName).orElseThrow());
    }
}





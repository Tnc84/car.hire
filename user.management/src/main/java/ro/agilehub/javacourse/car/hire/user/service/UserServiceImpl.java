package ro.agilehub.javacourse.car.hire.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.entity.UserEnum;
import ro.agilehub.javacourse.car.hire.user.repository.definition.UserRepository;
import ro.agilehub.javacourse.car.hire.user.service.mapper.UserDomainMapper;
import ro.agilehub.javacourse.car.hire.user.service.validator.UserServiceValidator;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    UserDomainMapper userDomainMapper;
    UserServiceValidator userServiceValidator;

    @Override
    public List<UserDomain> findAllUsers() {
        var findUsers = userRepository.findAll();
        if (findUsers.isEmpty()) {
            throw new NoSuchElementException();
        }
        return findUsers.stream().map(userDomainMapper::toDomain)
                .collect(Collectors.toList());

//        var findUsers = userDomainMapper.toUserDomainList(userRepository.findAll());
//        return findUsers;
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
    public UserDomain getByUsername(String username) {
        return userDomainMapper.toDomain(userRepository.findByUsernameIgnoreCase(username).orElseThrow());
    }
}





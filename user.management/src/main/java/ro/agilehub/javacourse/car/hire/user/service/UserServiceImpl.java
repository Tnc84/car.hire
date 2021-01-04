package ro.agilehub.javacourse.car.hire.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.entity.UserEnum;
import ro.agilehub.javacourse.car.hire.user.repository.UserRepository;
import ro.agilehub.javacourse.car.hire.user.service.mapper.UserDomainMapper;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserDomainMapper userDomainMapper;

    @Override
    public List<UserDomain> findAllUsers() {
        var findUsers = userRepository.findAll();
        return findUsers.stream().map(userDomainMapper::toDomain)
                .collect(Collectors.toList());

//        var findUsers = userDomainMapper.toUserDomainList(userRepository.findAll());
//        return findUsers;
    }

    @Override
    public UserDomain findById(Integer id) {
        var getUser = userRepository.findById(id);
        return getUser.map(userDomainMapper::toDomain).orElseThrow();

//        return userDomainMapper.toDomain(userRepository.getOne(id));
    }

    @Override
    public int addUser(UserDomain userDomain) {
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
}





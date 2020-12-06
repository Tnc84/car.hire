package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

@Mapper(componentModel = "spring", uses = {ObjectIdMapper.class})
public interface UserMapper {


    @Mapping(target = "id", source = "user.id")
    UserDomain toDomain(User user);

    @Mapping(target = "id", source = "userDomain.id")
    User toUser(UserDomain userDomain);

//    @Named("returnUserDomain")
//    default UserDomain returnUserDomain(User user){
//        var getAllUsers = new UserDomain();
//        getAllUsers.setId(getAllUsers.getId());
//        getAllUsers.setUserName(getAllUsers.getUserName());
//        getAllUsers.setCountry(getAllUsers.getCountry());
//        return getAllUsers;
//    }
}

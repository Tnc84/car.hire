package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.*;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.userDomain.CountryDomain;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

import java.util.List;

@Mapper(componentModel = "spring", uses = CountryDomain.class)
public interface UserDomainMapper {

    @Mapping(source = "id", target = "id")
    UserDomain toDomain(User user);

    @Mapping(source = "id", target = "id")
    User toUser(UserDomain userDomain);

    List<UserDomain>toUserDomainList(List<User>userList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "password", ignore = true)
    void patchUser(UserDomain userDO, @MappingTarget User user);
}

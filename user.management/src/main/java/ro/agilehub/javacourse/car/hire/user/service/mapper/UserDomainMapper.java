package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.*;
import ro.agilehub.javacourse.car.hire.user.repository.entity.User;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.CountryDomain;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.UserDomain;

import java.util.List;

@Mapper(componentModel = "spring", uses = CountryDomain.class)
public interface UserDomainMapper {

    @Mapping(source = "id", target = "id")
    @ValueMapping(source = "ACTIVE", target = "ACTIVE")
    @ValueMapping(source = "DENIED", target = "DELETED")
    UserDomain toDomain(User user);

    @Mapping(source = "id", target = "id")
    @ValueMapping(source = "ACTIVE", target = "ACTIVE")
    @ValueMapping(source = "DELETED", target = "DENIED")
    User toUser(UserDomain userDomain);

    @ValueMapping(source = "ACTIVE", target = "ACTIVE")
    @ValueMapping(source = "DENIED", target = "DELETED")
    List<UserDomain>toUserDomainList(List<User>userList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "password", ignore = true)
    @ValueMapping(source = "ACTIVE", target = "ACTIVE")
    @ValueMapping(source = "DELETED", target = "DENIED")
    void patchUser(UserDomain userDO, @MappingTarget User user);
}

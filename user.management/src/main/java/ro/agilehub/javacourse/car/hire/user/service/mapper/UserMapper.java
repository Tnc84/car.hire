package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

@Mapper(componentModel = "spring", uses = {CountryMapper.class, ObjectIdMapper.class})
public interface UserMapper {

    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "userName", source = "user.userName")
    @Mapping(target = "country", source = "country")
    UserDomain toDomainObject(User user, Country country);
}

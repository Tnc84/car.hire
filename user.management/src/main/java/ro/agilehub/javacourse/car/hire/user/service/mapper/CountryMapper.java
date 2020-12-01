package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.userDomain.CountryDomain;

@Mapper(componentModel = "spring", uses = ObjectIdMapper.class)
public interface CountryMapper {
    CountryDomain toDomainObject(Country country);
}

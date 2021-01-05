package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.agilehub.javacourse.car.hire.user.repository.entity.Country;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.CountryDomain;

@Mapper(componentModel = "spring")
public interface CountryDomainMapper {

    @Mapping(source = "id", target = "id")
    CountryDomain toCountryDomain(Country country);

    @Mapping(source = "id", target = "id")
    Country toCountry(CountryDomain countryDomain);
}

package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.user.repository.entity.Country;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.CountryDomain;

@Mapper(componentModel = "spring")
public interface CountryDomainMapper {

    CountryDomain toCountryDomain(Country country);

    Country toCountry(CountryDomain countryDomain);
}

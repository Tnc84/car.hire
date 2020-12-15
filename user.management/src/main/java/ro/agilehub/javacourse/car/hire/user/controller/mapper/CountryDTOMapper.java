package ro.agilehub.javacourse.car.hire.user.controller.mapper;

import ro.agilehub.javacourse.car.hire.api.model.CountryDTO;
import ro.agilehub.javacourse.car.hire.user.userDomain.CountryDomain;

public interface CountryDTOMapper {


    CountryDTO toCountryDTO(CountryDomain countryDO);

    CountryDomain toCountryDomain(CountryDTO countryDTO);
}

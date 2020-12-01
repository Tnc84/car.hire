package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

@Mapper(componentModel = "spring", uses = {CountryMapper.class, ObjectIdMapper.class})
public interface UserDTOTOUser {
    @Mapping(target = "id", source = "userDTO.id")
    @Mapping(target = "email", source = "userDTO.email")
    @Mapping(target = "password", source = "userDTO.password")
    @Mapping(target = "userName", source = "userDTO.userName")
    @Mapping(target = "firstName", source = "userDTO.firstName")
    @Mapping(target = "lastName", source = "userDTO.lastName")
    @Mapping(target = "driverLicense", source = "userDTO.driverLicenseNo")
    @Mapping(target = "country", source = "country")
    @Mapping(target = "status", source = "userDTO.status")

    UserDomain userDTOToUserDomain(UserDTO userDTO, Country country);
}

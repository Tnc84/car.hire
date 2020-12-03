package ro.agilehub.javacourse.car.hire.user.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.service.mapper.CountryMapper;
import ro.agilehub.javacourse.car.hire.user.service.mapper.ObjectIdMapper;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

@Mapper(componentModel = "spring", uses = {CountryMapper.class, ObjectIdMapper.class})
public interface UserDTOMapper {

    @Mapping(target = "id", source = "userDTO.id")
    @Mapping(target = "country", source = "country")
    UserDomain toUserDomain(UserDTO userDTO, Country country);

    @Mapping(target = "id", source = "userDomain.id")
    @Mapping(target = "country", source = "country")
    UserDTO toUserDTO(UserDomain userDomain, Country country);

    @Named("returnDTO")
    default UserDTO returnDTO(UserDomain userDomain){
        var getAllUsers = new UserDTO();
        getAllUsers.setId(getAllUsers.getId());
        getAllUsers.setUserName(getAllUsers.getUserName());
        getAllUsers.setCountry(getAllUsers.getCountry());
        return getAllUsers;
    }
}

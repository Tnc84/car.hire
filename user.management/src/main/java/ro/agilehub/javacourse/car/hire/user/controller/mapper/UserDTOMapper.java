package ro.agilehub.javacourse.car.hire.user.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.CountryDomain;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.UserDomain;

import java.util.List;

@Mapper(componentModel = "spring", uses = CountryDomain.class)
public interface UserDTOMapper {

    @Mapping(target = "id", ignore = true)
    UserDomain toNewDomain(UserDTO userDTO);

    List<UserDTO> toUserDTOList(List<UserDomain> userDOList);

    UserDTO toUserDTO(UserDomain userDomain);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "password", ignore = true)
    UserDomain toUserDomain(UserDTO userDTO);

    @Mapping(target = "id", ignore = true)
    UserDomain toNewUserDO(UserDTO userDTO);
}

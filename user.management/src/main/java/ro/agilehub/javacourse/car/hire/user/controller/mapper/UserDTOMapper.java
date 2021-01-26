package ro.agilehub.javacourse.car.hire.user.controller.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.CountryDomain;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.UserDomain;

import java.util.List;

@Mapper(componentModel = "spring", uses = CountryDomain.class)
public interface UserDTOMapper {

    UserDomain toNewDomain(UserDTO userDTO);

    List<UserDTO> toUserDTOList(List<UserDomain> userDOList);

    UserDTO toUserDTO(UserDomain userDomain);

    UserDomain toUserDomain(UserDTO userDTO);

    UserDomain toNewUserDO(UserDTO userDTO);
}

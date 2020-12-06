package ro.agilehub.javacourse.car.hire.user.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.user.service.mapper.CountryMapper;
import ro.agilehub.javacourse.car.hire.user.service.mapper.ObjectIdMapper;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

@Mapper(componentModel = "spring", uses = {CountryMapper.class, ObjectIdMapper.class})
public interface UserDTOMapper {

    @Mapping(target = "id", source = "userDTO.id")
    UserDomain toUserDomain(UserDTO userDTO);

    @Mapping(target = "id", source = "userDomain.id")
    UserDTO toUserDTO(UserDomain userDomain);

//    @Named("returnDTO")
//    default UserDTO returnDTO(UserDomain userDomain){
//        var getAllUsers = new UserDTO();
//        getAllUsers.setId(Integer.valueOf(userDomain.getId()));
//        getAllUsers.setUserName(getAllUsers.getUserName());
//        getAllUsers.setCountry(getAllUsers.getCountry());
//        return getAllUsers;
//    }
}

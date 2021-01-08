package ro.agilehub.javacourse.car.hire.user.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.agilehub.javacourse.car.hire.api.model.CarDTO;
import ro.agilehub.javacourse.car.hire.user.service.carDomain.CarDomain;

import java.util.List;

@Mapper(componentModel = "spring", uses = CarDomain.class)
public interface CarDTOMapper {

    @Mapping(source = "id", target = "id")
    CarDomain toCarDomain(CarDTO carDTO);

    @Mapping(source = "id", target = "id")
    CarDTO toCarDTO(CarDomain carDomain);

    @Mapping(source = "id", target = "id")
    List<CarDTO>toCarDTOList(List<CarDomain>carDTOList);
}

package ro.agilehub.javacourse.car.hire.user.controller.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.api.model.CarDTO;
import ro.agilehub.javacourse.car.hire.user.service.carDomain.CarDomain;

import java.util.List;

@Mapper(componentModel = "spring", uses = CarDomain.class)
public interface CarDTOMapper {

    CarDomain toCarDomain(CarDTO carDTO);

    CarDTO toCarDTO(CarDomain carDomain);

    List<CarDTO>toCarDTOList(List<CarDomain>carDTOList);
}

package ro.agilehub.javacourse.car.hire.user.service.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ValueMapping;
import ro.agilehub.javacourse.car.hire.user.repository.entity.Car;
import ro.agilehub.javacourse.car.hire.user.service.carDomain.CarDomain;

import java.util.List;

@Mapper(componentModel = "spring", uses = CarDomain.class)
public interface CarDomainMapper {

    @Mapping(source = "id", target = "id")
    @ValueMapping(source = "A_SEGMENT, B_SEGMENT, C_SEGMENT, D_SEGMENT, E_SEGMENT, F_SEGMENT", target = "A_SEGMENT, B_SEGMENT, C_SEGMENT, D_SEGMENT, E_SEGMENT, F_SEGMENT")
    @ValueMapping(source = "GAS, DIESEL", target = "GAS, DIESEL")
    @ValueMapping(source = "ACTIVE, DELETED", target = "ACTIVE, DELETED")
    Car toCar(CarDomain carDomain);

    @Mapping(source = "id", target = "id")
    @ValueMapping(source = "A_SEGMENT, B_SEGMENT, C_SEGMENT, D_SEGMENT, E_SEGMENT, F_SEGMENT", target = "A_SEGMENT, B_SEGMENT, C_SEGMENT, D_SEGMENT, E_SEGMENT, F_SEGMENT")
    @ValueMapping(source = "GAS, DIESEL", target = "GAS, DIESEL")
    @ValueMapping(source = "ACTIVE, DELETED", target = "ACTIVE, DELETED")
    CarDomain toCarDomain(Car car);

    @Mapping(source = "id", target = "id")
    List<CarDomain>toCarDomainList(List<Car>carDomainList);

}

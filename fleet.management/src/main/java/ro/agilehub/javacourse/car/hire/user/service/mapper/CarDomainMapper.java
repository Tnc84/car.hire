package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.user.domain.CarDomain;
import ro.agilehub.javacourse.car.hire.user.entity.Car;

@Mapper(componentModel = "spring", uses = ObjectIdMapper.class)
public interface CarDomainMapper {

    CarDomain toDomainObject(Car car);
}

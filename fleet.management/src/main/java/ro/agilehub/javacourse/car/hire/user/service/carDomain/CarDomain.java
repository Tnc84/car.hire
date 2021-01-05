package ro.agilehub.javacourse.car.hire.user.service.carDomain;

import lombok.*;
import ro.agilehub.javacourse.car.hire.api.model.FuelType;
import ro.agilehub.javacourse.car.hire.user.repository.entity.CarClass;
import ro.agilehub.javacourse.car.hire.user.repository.entity.StatusCar;

@Data
@EqualsAndHashCode(of = "id")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDomain {
    private int id;
    private String make;
    private String model;
    private String year;
    private String mileage;
    private FuelType fuelType;
    private CarClass carClass;
    private StatusCar status;
}

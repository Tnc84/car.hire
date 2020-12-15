package ro.agilehub.javacourse.car.hire.user.userDomain;

import lombok.*;
import ro.agilehub.javacourse.car.hire.user.entity.CarClass;
import ro.agilehub.javacourse.car.hire.user.entity.StatusCar;

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
    private String fuel;
    private CarClass carClazz;
    private StatusCar status;
}

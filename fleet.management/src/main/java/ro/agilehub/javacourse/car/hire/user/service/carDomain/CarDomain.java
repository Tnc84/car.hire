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
public record CarDomain(int id, String make, String model, String year, String mileage, FuelType fuelType,
                        CarClass carClass, StatusCar status) {
}

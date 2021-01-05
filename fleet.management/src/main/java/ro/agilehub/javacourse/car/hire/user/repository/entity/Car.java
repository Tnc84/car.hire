package ro.agilehub.javacourse.car.hire.user.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ro.agilehub.javacourse.car.hire.api.model.FuelType;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
@EqualsAndHashCode(of = "id")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String make;
    private String model;
    private String year;
    private String mileage;
    private FuelType fuelType;

    @JoinColumn
    private CarClass carClass;

    @JoinColumn
    private StatusCar status;

}

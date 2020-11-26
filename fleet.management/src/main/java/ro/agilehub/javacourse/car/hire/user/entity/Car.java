package ro.agilehub.javacourse.car.hire.user.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
@EqualsAndHashCode(of = "id")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @JoinColumn
    private CarClass carClass;

    @JoinColumn
    private StatusCar statusCar;

}

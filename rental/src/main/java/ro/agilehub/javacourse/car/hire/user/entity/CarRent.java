package ro.agilehub.javacourse.car.hire.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ro.agilehub.javacourse.car.hire.user.repository.entity.Car;
import ro.agilehub.javacourse.car.hire.user.repository.entity.StatusCar;
import ro.agilehub.javacourse.car.hire.user.repository.entity.User;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "car_rent")
@Data
@EqualsAndHashCode(of = "id")
public class CarRent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car carId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private StatusCar status;
}

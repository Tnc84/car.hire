package ro.agilehub.javacourse.car.hire.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document(collection = "car")
@EqualsAndHashCode(of = "id")
public class Car {

    @Id
    @Field("_id")
    private int id;
    private String make;
    private String model;
    private String year;
    private String mileage;
    private String fuel;
    private CarClass carClazz;
    private StatusCar status;

}

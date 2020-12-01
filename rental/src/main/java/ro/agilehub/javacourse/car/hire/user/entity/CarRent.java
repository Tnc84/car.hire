package ro.agilehub.javacourse.car.hire.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.OffsetDateTime;

@Document(collection = "car_rent")
@EqualsAndHashCode(of = "id")
@Data
public class CarRent {

    @Id
    @Field("_id")
    private int id;
//    private Car carId;
//    private User userId;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
//    private StatusCar status;
}

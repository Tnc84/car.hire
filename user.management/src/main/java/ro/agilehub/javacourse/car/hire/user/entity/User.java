package ro.agilehub.javacourse.car.hire.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@EqualsAndHashCode(of = "id")
@Document(collection = "user")
public class User {

    @Id
    @Field("_id")
    private ObjectId id;

    private String firstName;
    private String lastName;
    private String userName;
    private String driverLicense;
    private String email;
    private String password;
    private Country country;
    private UserEnum status;
}

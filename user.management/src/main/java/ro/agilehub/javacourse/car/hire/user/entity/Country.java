package ro.agilehub.javacourse.car.hire.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "country")
@EqualsAndHashCode(of = "id")
public class Country {

    @Id
    @Field("_id")
    private int id;

    private String name;
    private String isoCode;
}

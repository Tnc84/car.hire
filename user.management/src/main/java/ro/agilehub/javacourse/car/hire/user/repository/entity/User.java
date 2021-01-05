package ro.agilehub.javacourse.car.hire.user.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "user")
@Data
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String userName;
    private String driverLicense;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private UserEnum status;
}

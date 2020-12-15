package ro.agilehub.javacourse.car.hire.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
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

//    @Transient
//    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String status;
//    private boolean active = true;
}

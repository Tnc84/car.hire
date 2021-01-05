package ro.agilehub.javacourse.car.hire.user.service.userDomain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class UserDomain {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String driverLicense;
    private String email;
    private String password;
    private CountryDomain country;
    private UserStatusDomain status;
}

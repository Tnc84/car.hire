package ro.agilehub.javacourse.car.hire.user.userDomain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.entity.UserEnum;

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
    private Country country;
    private UserEnum status;
}

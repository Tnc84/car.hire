package ro.agilehub.javacourse.car.hire.user.service.userDomain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id", callSuper = false)
public record UserDomain( int id, String firstName, String lastName, String userName,
     String driverLicense, String email, String password, CountryDomain country, UserStatusDomain status){
    public UserDomain {
    }
}

package ro.agilehub.javacourse.car.hire.user.service.userDomain;


public record UserDomain(int id, String userName, String driverLicense, String email, CountryDomain country,
                         UserStatusDomain status) {
    public UserDomain {
    }
}

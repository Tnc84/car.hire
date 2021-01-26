package ro.agilehub.javacourse.car.hire.user.service.userDomain;

public record BaseEntityDomain(int id, String firstName, String lastName, String password,
                               UserDomain nameAndPassword) {
}

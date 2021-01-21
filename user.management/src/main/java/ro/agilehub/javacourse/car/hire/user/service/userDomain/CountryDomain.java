package ro.agilehub.javacourse.car.hire.user.service.userDomain;

import lombok.Data;

@Data
public record CountryDomain (Integer id, String name, String isoCode) {
}

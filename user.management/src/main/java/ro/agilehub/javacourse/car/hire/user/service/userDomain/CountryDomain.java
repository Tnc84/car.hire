package ro.agilehub.javacourse.car.hire.user.service.userDomain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "id", callSuper = false)
@Data
public record CountryDomain (Integer id, String name, String isoCode) {
    public CountryDomain {
    }
}

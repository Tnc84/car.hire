package ro.agilehub.javacourse.car.hire.user.service.userDomain;

import lombok.Data;

@Data
public class CountryDomain {

    private Integer id;
    private String name;
    private String isoCode;
}

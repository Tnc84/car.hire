package ro.agilehub.javacourse.car.hire.user.userDomain;

import lombok.*;

@Data
@EqualsAndHashCode(of = "id")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDomain {
    private String id;

    private String name;

    private String isoCode;
}

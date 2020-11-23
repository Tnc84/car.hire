package ro.agilehub.javacourse.car.hire.user.entity;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Entity
@Table(name = "car_rent")
public class CarRent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "make_id")
    Make make;

    @ManyToOne
    @JoinColumn(name = "user_id")
    CountryOfResidence countryOfResidence;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public CountryOfResidence getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(CountryOfResidence countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }
}

package ro.agilehub.javacourse.car.hire.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.entity.CountryOfResidence;
import ro.agilehub.javacourse.car.hire.user.service.CountryService;
import ro.agilehub.javacourse.car.hire.user.service.CountryServiceImpl;

import java.util.List;

@RestController
public class CountryController implements CountryService {

    CountryServiceImpl countryService;


    @GetMapping("findAll")
    public List<CountryOfResidence> findAll() {
        List<CountryOfResidence> countries = countryService.findAll();
        return countryService.findAll();
    }

    @GetMapping("findAll/{id}")
    public CountryOfResidence findById(Integer id) {
        CountryOfResidence country = countryService.findById(id);
        return countryService.findById(id);
    }
}

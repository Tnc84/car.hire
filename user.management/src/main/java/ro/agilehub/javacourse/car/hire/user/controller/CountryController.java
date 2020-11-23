package ro.agilehub.javacourse.car.hire.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.entity.Entity;
import ro.agilehub.javacourse.car.hire.user.service.CountryService;
import ro.agilehub.javacourse.car.hire.user.service.CountryServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController implements CountryService {

    CountryServiceImpl countryService;


    @GetMapping("findAll")
    public List<Country> findAll() {
        List<Country> countries = countryService.findAll();
        return countryService.findAll();
    }

    @GetMapping("findAll/{id}")
    public Country findById(Integer id) {
        Country country = countryService.findById(id);
        return countryService.findById(id);
    }
}

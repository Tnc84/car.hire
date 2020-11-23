package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.entity.Country;

import java.util.List;
import java.util.Optional;

@Service
public interface CountryService {
    List<Country> findAll();

    Country findById(Integer id);

}

package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.CountryDomain;

import java.util.List;

@Service
public interface CountryService {
    CountryDomain findById(Integer id);
//    CountryDomain findByName(String name);
    List<CountryDomain>findAll();
}

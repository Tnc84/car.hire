package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.entity.CountryOfResidence;
import ro.agilehub.javacourse.car.hire.user.repository.CountryOfResidenceRepository;
import ro.agilehub.javacourse.car.hire.user.repository.CountryRepository;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryOfResidenceRepository countryOfResidenceRepository;

    @GetMapping("/findAll")
    public List<CountryOfResidence> findAll() {
        return countryOfResidenceRepository.findAll();
    }

    @GetMapping("/findAll/{id}")
    public CountryOfResidence findById(Integer id) {
        return countryOfResidenceRepository.findById(id).orElseThrow();
    }
}

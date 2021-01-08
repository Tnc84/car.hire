package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.service.carDomain.CarDomain;

import java.util.List;

@Service
public interface CarService {
    List<CarDomain> findAll();

    CarDomain findById(Integer id);
}

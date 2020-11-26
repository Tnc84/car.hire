package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.entity.Car;

import java.util.List;

@Service
public interface CarService {
    List<Car> findAll();

    Car findById(Integer id);
}

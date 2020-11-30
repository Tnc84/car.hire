package ro.agilehub.javacourse.car.hire.user.service;

import ro.agilehub.javacourse.car.hire.user.domain.CarDomain;

import java.util.List;

public interface CarService {
    List<CarDomain> findAll();

    CarDomain findById(String id);
}

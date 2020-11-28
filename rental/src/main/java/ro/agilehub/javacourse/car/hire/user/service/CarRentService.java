package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.entity.CarRent;

import java.util.List;

@Service
public interface CarRentService {

    List<CarRent> findAll();

    CarRent findById(Integer id);
}

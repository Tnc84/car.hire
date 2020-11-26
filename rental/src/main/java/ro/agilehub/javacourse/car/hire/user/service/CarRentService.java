package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.Repository.CarRentRepository;
import ro.agilehub.javacourse.car.hire.user.entity.CarRent;

import java.util.List;
import java.util.Optional;

@Service
public interface CarRentService {

    List<CarRent> findAll();

    CarRent findById(Integer id);
}

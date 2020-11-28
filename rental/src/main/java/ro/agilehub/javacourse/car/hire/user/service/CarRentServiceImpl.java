package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.repository.CarRentRepository;
import ro.agilehub.javacourse.car.hire.user.entity.CarRent;

import java.util.List;

@Service
public class CarRentServiceImpl implements CarRentService {

    CarRentRepository carRentRepository;

    @Override
    public List<CarRent> findAll() {
        return carRentRepository.findAll();
    }

    @Override
    public CarRent findById(Integer id) {
        return carRentRepository.getOne(id);
    }
}

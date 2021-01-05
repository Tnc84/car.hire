package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.repository.CarRepository;
import ro.agilehub.javacourse.car.hire.user.repository.entity.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;


    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(Integer id) {
        return carRepository.findById(id).orElseThrow();
    }
}

package ro.agilehub.javacourse.car.hire.user.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.domain.CarDomain;
import ro.agilehub.javacourse.car.hire.user.entity.Car;
import ro.agilehub.javacourse.car.hire.user.repository.CarRepository;
import ro.agilehub.javacourse.car.hire.user.service.mapper.CarDomainMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    private CarDomainMapper carDomainMapper;


    @Override
    public List<CarDomain> findAll() {
        return carRepository.findAll()
                .stream().map(this::map)
                .collect(Collectors.toList());
    }

    @Override
    public CarDomain findById(String id) {
        return carRepository.findById(new ObjectId(id))
                .map(this::map)
                .orElseThrow();
    }

    private CarDomain map(Car car) {
        car = carRepository.findById(new ObjectId()).orElse(null);
        return carDomainMapper.toDomainObject(car);
    }
}

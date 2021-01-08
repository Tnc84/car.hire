package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.repository.CarRepository;
import ro.agilehub.javacourse.car.hire.user.service.carDomain.CarDomain;
import ro.agilehub.javacourse.car.hire.user.service.mapper.CarDomainMapper;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarDomainMapper carDomainMapper;


    @Override
    public List<CarDomain> findAll() {
        return carDomainMapper.toCarDomainList(carRepository.findAll());
    }

    @Override
    public CarDomain findById(Integer id) {
        return carDomainMapper.toCarDomain(carRepository.getOne(id));
    }
}

package ro.agilehub.javacourse.car.hire.user.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.CarDTO;
import ro.agilehub.javacourse.car.hire.api.specification.CarsApi;
import ro.agilehub.javacourse.car.hire.user.controller.mapper.CarDTOMapper;
import ro.agilehub.javacourse.car.hire.user.service.CarService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FleetController implements CarsApi {

    @Autowired
    CarService carService;

    @Autowired
    CarDTOMapper carDTOMapper;

    @Override
    @GetMapping(value = "/cars")
    public ResponseEntity<List<CarDTO>> getCars() {
        return ResponseEntity.ok(carDTOMapper.toCarDTOList(carService.findAll()));
    }

    @Override
    @GetMapping(value = "/cars/{id}")
    public ResponseEntity<CarDTO> getCarById(Integer id) {
        return ResponseEntity.ok(carDTOMapper.toCarDTO(carService.findById(id)));
    }
}

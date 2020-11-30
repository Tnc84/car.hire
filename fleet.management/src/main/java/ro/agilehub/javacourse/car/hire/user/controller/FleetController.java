package ro.agilehub.javacourse.car.hire.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.CarDTO;
import ro.agilehub.javacourse.car.hire.api.specification.CarsApi;
import ro.agilehub.javacourse.car.hire.user.service.CarService;
import ro.agilehub.javacourse.car.hire.user.service.CarServiceImpl;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class FleetController implements CarsApi {

    @Autowired
    private CarService carService;
    private CarServiceImpl carServiceImpl;

    @Override
    public ResponseEntity<List<CarDTO>> getCars() {
        var getAllCars = carService.findAll();
        return ResponseEntity.ok(getAllCars
                .stream()
                .map(getCars -> {
                    var result = new CarDTO();
                    result.setMake(getCars.getMake());
                    result.setModel(getCars.getModel());
                    result.setStatus(CarDTO.StatusEnum.ACTIVE);
                    return result;
                }).collect(toList())
        );
    }

    @Override
    public ResponseEntity<CarDTO> getCarById(String id) {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(carDTO.getId());
        return ResponseEntity.ok(carDTO);
    }

//    public ResponseEntity<CarDTO> getCarId() {
//        CarDTO carDTO = new CarDTO();
//        carDTO.setId(carDTO.getId());
//        return ResponseEntity.ok(carDTO);
//    }


}

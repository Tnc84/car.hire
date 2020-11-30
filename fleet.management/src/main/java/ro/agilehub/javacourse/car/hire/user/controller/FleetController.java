package ro.agilehub.javacourse.car.hire.user.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ro.agilehub.javacourse.car.hire.api.model.CarDTO;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.CarsApi;
import ro.agilehub.javacourse.car.hire.user.service.CarService;

import java.util.Collections;
import java.util.List;

@RestController
public class FleetController implements CarsApi {

    CarService carService;

    @Override
    public ResponseEntity<List<CarDTO>> getCars() {
        return null;
    }

    @Override
    public ResponseEntity<CarDTO> getCarById(Integer id) {
        return null;
    }


    public ResponseEntity<List<UserDTO>> getUsers() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setUserName("My first sample");
        return ResponseEntity.ok(Collections.singletonList(userDTO));
    }
}

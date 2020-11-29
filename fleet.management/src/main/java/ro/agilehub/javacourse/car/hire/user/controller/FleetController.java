package ro.agilehub.javacourse.car.hire.user.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import ro.agilehub.javacourse.car.hire.api.model.CarDTO;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.CarsApi;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class FleetController implements CarsApi {


    public ResponseEntity<List<UserDTO>> getUsers() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setUserName("My first sample");
        return ResponseEntity.ok(Collections.singletonList(userDTO));
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<CarDTO> addCar(@Valid CarDTO carDTO) {
        return null;
    }

    @Override
    public ResponseEntity<CarDTO> deleteCar(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<CarDTO> getCarById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<CarDTO>> getCars() {
        return null;
    }

    @Override
    public ResponseEntity<CarDTO> patchCar(Integer id, @Valid CarDTO carDTO) {
        return null;
    }
}

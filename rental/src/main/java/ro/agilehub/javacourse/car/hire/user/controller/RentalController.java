package ro.agilehub.javacourse.car.hire.user.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import ro.agilehub.javacourse.car.hire.api.model.RentalDTO;
import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.RentalsApi;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class RentalController implements RentalsApi {


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
    public ResponseEntity<RentalDTO> addRental(@Valid RentalDTO rentalDTO) {
        return null;
    }

    @Override
    public ResponseEntity<RentalDTO> cancelRental(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<RentalDTO> getRentalById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<RentalDTO>> getRentals() {
        return null;
    }

    @Override
    public ResponseEntity<RentalDTO> patchRental(Integer id, @Valid RentalDTO rentalDTO) {
        return null;
    }
}

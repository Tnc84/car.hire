package ro.agilehub.javacourse.car.hire.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.agilehub.javacourse.car.hire.user.entity.CarRent;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRentRepository extends JpaRepository<CarRent, Integer> {

}

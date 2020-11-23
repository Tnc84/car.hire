package ro.agilehub.javacourse.car.hire.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.agilehub.javacourse.car.hire.user.entity.Make;

import java.util.List;

@Repository
public interface MakeRepository extends JpaRepository<Make, Integer> {

}

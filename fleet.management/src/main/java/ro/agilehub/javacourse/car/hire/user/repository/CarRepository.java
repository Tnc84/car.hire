package ro.agilehub.javacourse.car.hire.user.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ro.agilehub.javacourse.car.hire.user.entity.Car;

@Repository
public interface CarRepository extends MongoRepository<Car, ObjectId> {

}

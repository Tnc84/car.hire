package ro.agilehub.javacourse.car.hire.user.repository.definition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.agilehub.javacourse.car.hire.user.repository.entity.BaseEntity;

@Repository
public interface BaseEntityRepository extends JpaRepository<Integer, BaseEntity> {
}

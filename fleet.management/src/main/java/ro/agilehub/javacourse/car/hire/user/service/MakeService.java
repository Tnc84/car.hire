package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.entity.Make;

import java.util.List;

@Service
public interface MakeService {
    List<Make> findAll();

    Make findById(Integer id);
}

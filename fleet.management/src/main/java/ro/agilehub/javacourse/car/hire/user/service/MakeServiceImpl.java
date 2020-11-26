package ro.agilehub.javacourse.car.hire.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.entity.Make;
import ro.agilehub.javacourse.car.hire.user.repository.MakeRepository;

import java.util.List;

@Service
public class MakeServiceImpl implements MakeService{

    @Autowired
    private MakeRepository makeRepository;


    @Override
    public List<Make> findAll() {
        return makeRepository.findAll();
    }

    @Override
    public Make findById(Integer id) {
        return makeRepository.findById(id).orElseThrow();
    }
}

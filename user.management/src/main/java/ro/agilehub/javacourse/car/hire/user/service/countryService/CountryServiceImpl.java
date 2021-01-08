package ro.agilehub.javacourse.car.hire.user.service.countryService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.user.repository.definition.CountryRepository;
import ro.agilehub.javacourse.car.hire.user.service.mapper.CountryDomainMapper;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.CountryDomain;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    CountryDomainMapper countryDomainMapper;

    @Override
    public CountryDomain findById(Integer id) {
        return countryDomainMapper.toCountryDomain(countryRepository.getOne(id));
    }

//    @Override
//    public CountryDomain findByName(String name) {
//        return countryDomainMapper.toCountryDomain(countryRepository.findByCountryName(name).orElseThrow());
//    }

    @Override
    public List<CountryDomain> findAll() {
        return null;
    }
}

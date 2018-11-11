package ru.dbzukunft.predictor.server.service.city;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dbzukunft.predictor.server.entity.City;
import ru.dbzukunft.predictor.server.repository.CityRepository;
import ru.dbzukunft.predictor.server.util.dto.CityDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Override
    public List<CityDTO> findAll() {

        List<City> foundedCities = cityRepository.findAll();

        foundedCities.add(City.builder().title("City1").build());
        foundedCities.add(City.builder().title("City2").build());

        if (foundedCities.isEmpty()) {
            return Collections.emptyList();
        }

        return foundedCities.stream()
                .map(city -> CityDTO.builder()
                        .title(city.getTitle())
                        .build()
                )
                .collect(Collectors.toList());
    }
}

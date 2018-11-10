package ru.dbzukunft.predictor.server.service.city;

import ru.dbzukunft.predictor.server.util.dto.CityDTO;

import java.util.List;

public interface CityService {
    List<CityDTO> findAll();
}

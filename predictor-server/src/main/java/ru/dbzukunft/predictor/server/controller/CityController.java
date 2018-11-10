package ru.dbzukunft.predictor.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dbzukunft.predictor.server.service.city.CityService;
import ru.dbzukunft.predictor.server.util.dto.CityDTO;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cities")
@AllArgsConstructor
public class CityController {

    private CityService cityService;

    @GetMapping
    public ResponseEntity<?> getAllCities() {

        List<CityDTO> cities = cityService.findAll();

        return new ResponseEntity<>(cities, HttpStatus.OK);
    }
}

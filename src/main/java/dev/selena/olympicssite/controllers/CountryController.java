package dev.selena.olympicssite.controllers;

import dev.selena.olympicssite.models.Country;
import dev.selena.olympicssite.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        try {
            List<Country> countries = new ArrayList<Country>();

            countryRepository.findAll().forEach(countries::add);

            if (countries.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(countries, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

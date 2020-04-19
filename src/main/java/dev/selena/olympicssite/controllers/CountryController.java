package dev.selena.olympicssite.controllers;

import dev.selena.olympicssite.models.Country;
import dev.selena.olympicssite.models.MedalResults;
import dev.selena.olympicssite.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        try {
            List<Country> countries = countryService.getAllCountries();

            if (countries.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(countries, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/countries/{year}")
    public ResponseEntity<List<Country>> getAllCountriesByYear(@PathVariable("year") int year) {
        try {
            List<Country> countries = countryService.getAllCountriesByYear(year);

            if (countries.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(countries, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/countries/{year}/{noc}")
    public ResponseEntity<List<MedalResults>> getMedalCountsByYear(@PathVariable("year") int year, @PathVariable("noc") String noc) {
        try {
            List<MedalResults> medals = countryService.getMedalCountsByYear(noc, year);

            if (medals.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(medals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

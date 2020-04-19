package dev.selena.olympicssite.services.impl;

import dev.selena.olympicssite.models.Country;
import dev.selena.olympicssite.repositories.CountryRepository;
import dev.selena.olympicssite.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {

        List<Country> countries = new ArrayList<Country>();

        countryRepository.findAll().forEach(countries::add);

        return countries;

    }

    public List<Country> getAllCountriesByYear(int year) {

        List<Country> countries = new ArrayList<Country>();

        countryRepository.findByYear(year).forEach(countries::add);

        return countries;
    }
}

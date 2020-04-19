package dev.selena.olympicssite.services;

import dev.selena.olympicssite.models.Country;

import java.util.List;

public interface CountryService {

    List<Country> getAllCountries();

    List<Country> getAllCountriesByYear(int year);

}

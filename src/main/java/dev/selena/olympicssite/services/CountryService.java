package dev.selena.olympicssite.services;

import dev.selena.olympicssite.models.Country;
import dev.selena.olympicssite.models.MedalResults;

import java.util.List;
import java.util.Map;

public interface CountryService {

    List<Country> getAllCountries();

    List<Country> getAllCountriesByYear(int year);

    List<MedalResults> getMedalCountsByYear(String noc, int year);

}

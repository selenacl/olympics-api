package dev.selena.olympicssite.services;

import dev.selena.olympicssite.models.Athlete;

import java.util.List;

public interface AthleteService {

    List<Athlete> getAllAthletesByYear(int year);

}

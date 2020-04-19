package dev.selena.olympicssite.services.impl;

import dev.selena.olympicssite.models.Athlete;
import dev.selena.olympicssite.repositories.AthleteRepository;
import dev.selena.olympicssite.services.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AthleteServiceImpl implements AthleteService {

    @Autowired
    private AthleteRepository athleteRepository;

    public List<Athlete> getAllAthletesByYear(int year) {

        List<Athlete> athletes = new ArrayList<>();

        athleteRepository.findByYear(year).forEach(athletes::add);

        return athletes;
    }

}

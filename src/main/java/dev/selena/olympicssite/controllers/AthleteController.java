package dev.selena.olympicssite.controllers;

import dev.selena.olympicssite.models.Athlete;
import dev.selena.olympicssite.services.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AthleteController {

    @Autowired
    AthleteService athleteService;

    @GetMapping("/athletes/{year}")
    public ResponseEntity<List<Athlete>> getAllAthletesByYear(@PathVariable("year") int year) {
        try {
            List<Athlete> athletes = athleteService.getAllAthletesByYear(year);

            if (athletes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(athletes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

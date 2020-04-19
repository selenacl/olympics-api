package dev.selena.olympicssite.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.selena.olympicssite.models.Country;
import org.springframework.data.jpa.repository.Query;

public interface CountryRepository extends JpaRepository<Country, Long> {

    List<Country> findAll();

    @Query(value = "select distinct countries.noc, countries.name from countries join athletes on\n" +
            "countries.noc = athletes.country \n" +
            "join athlete_events on\n" +
            "athletes.id = athlete_events.athlete_id \n" +
            "join events on\n" +
            "athlete_events.event_id = events.id where year = ?\n" +
            "order by countries.noc", nativeQuery = true)
    List<Country> findByYear(int year);

}

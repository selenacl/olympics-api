package dev.selena.olympicssite.repositories;

import dev.selena.olympicssite.models.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {

    @Query(value = "select distinct athletes.* from athletes \n" +
            "join athlete_events on \n" +
            "athletes.id = athlete_events.athlete_id \n" +
            "join events on\n" +
            "athlete_events.event_id = events.id \n" +
            "where year = ?\n" +
            "order by athletes.name",
            nativeQuery = true)
    List<Athlete> findByYear(int year);

}

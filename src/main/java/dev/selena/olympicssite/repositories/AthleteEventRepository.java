package dev.selena.olympicssite.repositories;

import dev.selena.olympicssite.models.AthleteEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteEventRepository extends JpaRepository<AthleteEvent, Long> {
}

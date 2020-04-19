package dev.selena.olympicssite.repositories;

import dev.selena.olympicssite.models.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {
}

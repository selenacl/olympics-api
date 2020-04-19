package dev.selena.olympicssite.repositories;

import dev.selena.olympicssite.models.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport, Long> {
}

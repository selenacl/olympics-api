package dev.selena.olympicssite.repositories;

import dev.selena.olympicssite.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

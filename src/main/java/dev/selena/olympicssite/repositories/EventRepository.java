package dev.selena.olympicssite.repositories;

import dev.selena.olympicssite.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}

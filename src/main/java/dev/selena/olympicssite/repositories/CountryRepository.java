package dev.selena.olympicssite.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.selena.olympicssite.models.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

    List<Country> findByNoc(String noc);

    List<Country> findByName(String name);

    List<Country> findAll();
}

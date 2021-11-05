package com.github.IagoPires.cities.countries.repository;

import com.github.IagoPires.cities.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

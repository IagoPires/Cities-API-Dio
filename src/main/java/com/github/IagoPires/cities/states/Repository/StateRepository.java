package com.github.IagoPires.cities.states.Repository;

import com.github.IagoPires.cities.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
package com.example.plane.demo.repositories;

import com.example.plane.demo.domains.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {

}

package org.example.spring_exo_bibliotheque.bll.services;

import org.example.spring_exo_bibliotheque.dl.entities.Location;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LocationServices {

    List<Location> findAll();

    Location findById(UUID id);

    List<Location> findByStartDate(LocalDate startDate);

    List<Location> findByEndDate(LocalDate endDate);

    Location save(Location location);
}

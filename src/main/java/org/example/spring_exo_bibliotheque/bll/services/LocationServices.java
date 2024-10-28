package org.example.spring_exo_bibliotheque.bll.services;

import org.example.spring_exo_bibliotheque.dl.entities.Location;

import java.util.List;
import java.util.UUID;

public interface LocationServices {

    List<Location> findAll();

    Location findById(UUID id);

    List<Location> findByStartDate();

    List<Location> findByEndDate();
}

package org.example.spring_exo_bibliotheque.bll.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_exo_bibliotheque.bll.services.LocationServices;
import org.example.spring_exo_bibliotheque.dal.repositories.LocationRepository;
import org.example.spring_exo_bibliotheque.dl.entities.Location;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LocationServicesImpl implements LocationServices {

    private final LocationRepository locationRepository;

    @Override
    public List<Location> findAll() {
        return List.of();
    }

    @Override
    public Location findById(UUID id) {
        return null;
    }

    @Override
    public List<Location> findByStartDate() {
        return List.of();
    }

    @Override
    public List<Location> findByEndDate() {
        return List.of();
    }


}

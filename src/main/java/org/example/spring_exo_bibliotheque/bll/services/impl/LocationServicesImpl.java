package org.example.spring_exo_bibliotheque.bll.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_exo_bibliotheque.bll.services.LocationServices;
import org.example.spring_exo_bibliotheque.dal.repositories.LocationRepository;
import org.example.spring_exo_bibliotheque.dl.entities.Location;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LocationServicesImpl implements LocationServices {

    private final LocationRepository locationRepository;

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public Location findById(UUID id) {
        return locationRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Location> findByStartDate(LocalDate startDate) {
        return locationRepository.findByStartAt(startDate);
    }

    @Override
    public List<Location> findByEndDate(LocalDate endDate) {
        return List.of();
    }


}

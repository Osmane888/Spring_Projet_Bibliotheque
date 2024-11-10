package org.example.spring_exo_bibliotheque.bll.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_exo_bibliotheque.bll.services.LocationServices;
import org.example.spring_exo_bibliotheque.dal.repositories.BookRepository;
import org.example.spring_exo_bibliotheque.dal.repositories.ClientRepository;
import org.example.spring_exo_bibliotheque.dal.repositories.LocationRepository;
import org.example.spring_exo_bibliotheque.dl.entities.Book;
import org.example.spring_exo_bibliotheque.dl.entities.Client;
import org.example.spring_exo_bibliotheque.dl.entities.Location;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LocationServicesImpl implements LocationServices {

    private final LocationRepository locationRepository;
    private final BookRepository bookRepository;
    private final ClientRepository clientRepository;

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
        return locationRepository.findByStartDate(startDate);
    }

    @Override
    public List<Location> findByEndDate(LocalDate endDate) {
        return locationRepository.findByEndDate(endDate);
    }

    @Override
    public Location save(Location location) {
        Book book = location.getBook();
        Client client = location.getClient();
        if(!bookRepository.existsByIdOrIsbn(book.getId(), book.getIsbn()) && !clientRepository.existsById(client.getId())){
            throw new IllegalArgumentException("Le livre ou le client n'existe pas dans la base de données");
        }
        return locationRepository.save(location);
    }

}

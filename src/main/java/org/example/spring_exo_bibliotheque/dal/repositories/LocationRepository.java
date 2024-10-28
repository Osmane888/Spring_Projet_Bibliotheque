package org.example.spring_exo_bibliotheque.dal.repositories;

import org.example.spring_exo_bibliotheque.dl.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LocationRepository extends JpaRepository<Location, UUID> {
}

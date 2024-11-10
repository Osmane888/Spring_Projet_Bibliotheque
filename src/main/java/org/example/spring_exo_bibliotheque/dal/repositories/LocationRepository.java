package org.example.spring_exo_bibliotheque.dal.repositories;

import org.example.spring_exo_bibliotheque.dl.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface LocationRepository extends JpaRepository<Location, UUID> {

    @Query("select l from Location l where l.startAt = :date")
    List<Location> findByStartDate(LocalDate date);

    @Query("select l from Location l where l.endAt = :date")
    List<Location> findByEndDate(LocalDate date);
}

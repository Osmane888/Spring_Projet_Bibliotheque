package org.example.spring_exo_bibliotheque.dal.repositories;

import org.example.spring_exo_bibliotheque.dl.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {

}

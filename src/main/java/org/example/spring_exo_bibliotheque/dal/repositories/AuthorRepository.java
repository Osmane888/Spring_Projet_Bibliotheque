package org.example.spring_exo_bibliotheque.dal.repositories;

import org.example.spring_exo_bibliotheque.dl.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.UUID;

@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {

    @Query("select count(a) > 0 from Author a where a.firstName = :firstName and a.lastName = :lastName and a.birthDate = :birthDate")
    boolean existsAuthorByFirstNameAndLastNameAndBirthDate(String firstName, String lastName, LocalDate birthDate);
}
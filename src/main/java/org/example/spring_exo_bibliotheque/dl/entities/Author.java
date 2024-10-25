package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true) @ToString(callSuper = true)
public class Author extends Person {

    public Author(UUID id, String prenom, String nom, LocalDate birthDate) {
        super(id, prenom, nom, birthDate);
    }
}
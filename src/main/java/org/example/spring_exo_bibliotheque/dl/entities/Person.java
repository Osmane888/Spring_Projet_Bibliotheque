package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode(callSuper = true) @ToString
@MappedSuperclass
public abstract class Person extends BaseEntity{

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private LocalDate birthDate;

    public Person(UUID id, String prenom, String nom, LocalDate birthDate) {
        super(id);
        this.firstName = prenom;
        this.lastName = nom;
        this.birthDate = birthDate;
    }
}

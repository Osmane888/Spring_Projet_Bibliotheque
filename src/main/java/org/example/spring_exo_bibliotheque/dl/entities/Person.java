package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode(callSuper = true) @ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uk_prenom_nom", columnNames = {"prenom", "nom"})})
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

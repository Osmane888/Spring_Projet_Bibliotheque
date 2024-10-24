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
public abstract class Personne extends BaseEntity<UUID>{

    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private LocalDate birthDate;

    public Personne(UUID id, String prenom, String nom, LocalDate birthDate) {
        super(id);
        this.prenom = prenom;
        this.nom = nom;
        this.birthDate = birthDate;
    }
}

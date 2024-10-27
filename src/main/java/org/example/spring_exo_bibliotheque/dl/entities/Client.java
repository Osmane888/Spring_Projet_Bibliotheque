package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

//@Table(uniqueConstraints = {
//       @UniqueConstraint(name = "uk_prenom_nom", columnNames = {"prenom", "nom"})})
@Entity
@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true) @ToString(callSuper = true)
public class Client extends Person{

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Embedded
    private Address address;

    public Client(UUID id, String prenom, String nom, LocalDate birthDate, String email, String phoneNumber, Address address) {
        super(id, prenom, nom, birthDate);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}

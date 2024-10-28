package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class Location extends BaseEntity{

    @Column(nullable = false)
    private LocalDate startAt;

    @Column(nullable = false)
    private LocalDate endAt;

    public Location(UUID id, LocalDate startAt, LocalDate endAt) {
        super(id);
        this.startAt = ;
        this.endAt = endAt;
    }
}

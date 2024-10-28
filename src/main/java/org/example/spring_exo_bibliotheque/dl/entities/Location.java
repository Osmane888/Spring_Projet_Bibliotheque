package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Setter
    private LocalDate returnedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    private Book book;


    public Location(UUID id, LocalDate startAt, Client client, Book book) {
        super(id);
        this.startAt = startAt;
        this.endAt = startAt.plusDays(30);
        this.client = client;
        this.book = book;
    }


}

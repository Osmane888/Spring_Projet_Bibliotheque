package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true) @ToString(callSuper = true)
public class Book extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private String title;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private final Set<Categories> categories = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    private Author author;

    public Book(UUID id, String isbn, String title) {
        super(id);
        this.isbn = isbn;
        this.title = title;
    }
}
package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true) @ToString(callSuper = true)
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uk_isbn", columnNames = {"isbn"})
})
public class Book extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String isbn;

    @Setter
    @Column(nullable = false)
    private String title;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private final Set<Categories> categories = new HashSet<>();

    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Author author;

    public Book(UUID id, String isbn, String title, Author author) {
        super(id);
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
}
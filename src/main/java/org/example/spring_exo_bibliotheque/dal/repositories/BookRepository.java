package org.example.spring_exo_bibliotheque.dal.repositories;

import org.example.spring_exo_bibliotheque.dl.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {

    @Query("select b from Book b where b.title ilike %:title%")
    List<Book> findBookByTitle(String title);

    @Query("select b from Book b where b.isbn = :isbn")
    Optional<Book> findBookByIsbn(String isbn);
}

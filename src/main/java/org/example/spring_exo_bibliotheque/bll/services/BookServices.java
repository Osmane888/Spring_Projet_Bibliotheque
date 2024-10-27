package org.example.spring_exo_bibliotheque.bll.services;

import org.example.spring_exo_bibliotheque.dl.entities.Book;

import java.util.List;

public interface BookServices {

    Book save(Book book);

    void delete(Book book);

    List<Book> findAll();
}

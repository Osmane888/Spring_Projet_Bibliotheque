package org.example.spring_exo_bibliotheque.bll.services;

import org.example.spring_exo_bibliotheque.dl.entities.Book;

public interface BookServices {

    Book save(Book book);

    void delete(Book book);
}

package org.example.spring_exo_bibliotheque.bll.services;

import org.example.spring_exo_bibliotheque.dl.entities.Author;

public interface AuthorServices {

    Author save(Author author);

    void delete(Author author);
}

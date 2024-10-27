package org.example.spring_exo_bibliotheque.bll.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_exo_bibliotheque.bll.services.AuthorServices;
import org.example.spring_exo_bibliotheque.dal.repositories.AuthorRepository;
import org.example.spring_exo_bibliotheque.dl.entities.Author;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServicesImpl implements AuthorServices {

    private final AuthorRepository authorRepository;


    @Override
    public Author save(Author author) {
        if (authorRepository.existsAuthorByFirstNameAndLastNameAndBirthDate(author.getFirstName(), author.getLastName(), author.getBirthDate())) {
            throw new IllegalArgumentException("Author already registered");
        } else {
            return authorRepository.save(author);
        }
    }

    @Override
    public void delete(Author author) {

    }
}

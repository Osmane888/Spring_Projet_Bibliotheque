package org.example.spring_exo_bibliotheque.bll.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_exo_bibliotheque.bll.services.BookServices;
import org.example.spring_exo_bibliotheque.dal.repositories.BookRepository;
import org.example.spring_exo_bibliotheque.dl.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServicesImpl implements BookServices {

    private final BookRepository bookRepository;


    @Override
    public Book save(Book book) {
        bookRepository.findBookByIsbn(book.getIsbn()).orElseThrow(() -> new IllegalArgumentException("This book is already registered"));
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}

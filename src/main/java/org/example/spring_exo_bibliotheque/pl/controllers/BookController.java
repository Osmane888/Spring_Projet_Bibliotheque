package org.example.spring_exo_bibliotheque.pl.controllers;

import lombok.RequiredArgsConstructor;
import org.example.spring_exo_bibliotheque.bll.services.BookServices;
import org.example.spring_exo_bibliotheque.dl.entities.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookServices bookServices;

}
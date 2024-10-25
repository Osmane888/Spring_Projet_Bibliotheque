package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

public enum Categories {
    FANTAISIE(),
    SCIENCE_FICTION(),
    HORREUR(),
    BD(),
    Thriller(),
    Policier()
}

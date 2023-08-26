package com.kt.spring6jdk17recipeapp.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

/**
 * Created by kontelk on 8/26/23.
 */

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;


    // ----------------- Getters and Setters -------------------



}

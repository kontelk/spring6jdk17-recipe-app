package com.kt.spring6jdk17recipeapp.domain;

import jakarta.persistence.*;

import java.util.Set;

/**
 * Created by kontelk on 8/26/23.
 */

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;


    // ----------------- Getters and Setters -------------------





}

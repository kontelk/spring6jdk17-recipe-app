package com.kt.spring6jdk17recipeapp.domain;

import jakarta.persistence.*;

import java.util.Set;

/**
 * Created by kontelk on 8/25/23.
 */

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    //todo add
    //private Difficulty difficulty;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;


    // ----------------- Getters and Setters -------------------


}

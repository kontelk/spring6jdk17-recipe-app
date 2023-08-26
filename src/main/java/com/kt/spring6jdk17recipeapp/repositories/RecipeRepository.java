package com.kt.spring6jdk17recipeapp.repositories;

import com.kt.spring6jdk17recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kontelk on 8/26/23.
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}


package com.kt.spring6jdk17recipeapp.repositories;

import com.kt.spring6jdk17recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kontelk on 8/26/23.
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}


package com.example.demo.repositories;

import com.example.demo.domains.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Jackson.Wen
 */
@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

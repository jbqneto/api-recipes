package io.jbqneto.recipes.application.repositories;

import io.jbqneto.recipes.application.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}

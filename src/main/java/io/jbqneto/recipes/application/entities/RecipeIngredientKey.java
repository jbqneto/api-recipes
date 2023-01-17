package io.jbqneto.recipes.application.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RecipeIngredientKey implements Serializable {

    @Column(name = "recipe_id")
    long recipeId;

    @Column(name = "ingredient_id")
    long ingredientId;
}

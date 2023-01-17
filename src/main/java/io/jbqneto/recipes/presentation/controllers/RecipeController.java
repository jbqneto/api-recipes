package io.jbqneto.recipes.presentation.controllers;

import io.jbqneto.recipes.application.entities.Recipe;
import io.jbqneto.recipes.application.repositories.RecipeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/recipes")
public class RecipeController {

    private final RecipeRepository repository;

    public RecipeController(RecipeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Recipe> list() {
        return this.repository.findAll();
    }

    @PostMapping
    public void create(Recipe recipe) {

    }
}

package io.jbqneto.recipes.application.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_recipe")
public class Recipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    private int time;

    @ManyToMany
    @JoinTable(
            name = "tb_recipe_ingredient",
            joinColumns = @JoinColumn(name = "tb_ingredient"),
            inverseJoinColumns = @JoinColumn(name = "tb_")
    )
    private List<Ingredient> ingredients;

    private int output;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id && name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

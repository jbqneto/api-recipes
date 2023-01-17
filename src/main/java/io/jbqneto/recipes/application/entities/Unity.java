package io.jbqneto.recipes.application.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_unity")
public class Unity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
}

package com.kamilyrb.recipe.Entities;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long category_id;

    @NotBlank
    @Size(max = 40)
    private String name;
}

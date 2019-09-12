package com.kamilyrb.recipe.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipe_id;


    @NotBlank
    @Size(max = 64)
    private String name;


    @NotBlank
    @Size(max = 264)
    private String description;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}

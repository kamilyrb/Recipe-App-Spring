package com.kamilyrb.recipe.DataAccess;

import com.kamilyrb.recipe.Entities.Recipe;

import java.util.List;

public interface IRecipeDal {
    List<Recipe> getAll();
    List<Recipe> getRecipesOfCategory(int categoryId);
}

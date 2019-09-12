package com.kamilyrb.recipe.Business;

import com.kamilyrb.recipe.Entities.Recipe;

import java.util.List;

public interface IRecipeService {
    List<Recipe> getAll();
    List<Recipe> getAllRecipesOfCategory(int categoryId);
}

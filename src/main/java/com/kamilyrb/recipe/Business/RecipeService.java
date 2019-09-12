package com.kamilyrb.recipe.Business;

import com.kamilyrb.recipe.DataAccess.IRecipeDal;
import com.kamilyrb.recipe.Entities.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService implements IRecipeService {
    private IRecipeDal recipeDal;

    public RecipeService(IRecipeDal recipeDal) {
        this.recipeDal = recipeDal;
    }

    @Override
    public List<Recipe> getAll() {
        return recipeDal.getAll();
    }

    @Override
    public List<Recipe> getAllRecipesOfCategory(int categoryId) {
        return recipeDal.getRecipesOfCategory(categoryId);
    }
}

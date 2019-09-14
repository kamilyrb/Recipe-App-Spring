package com.kamilyrb.recipe.RestApi;

import com.kamilyrb.recipe.Business.IRecipeService;
import com.kamilyrb.recipe.Entities.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecipeController {
    private IRecipeService recipeService;

    @Autowired
    public RecipeController(IRecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @GetMapping("/meals")
    @CrossOrigin
    public List<Recipe> getRecipes(@RequestParam(value = "categoryId",required = false)  Integer categoryId) {
        if(categoryId == null)
            return recipeService.getAll();
        return recipeService.getAllRecipesOfCategory(categoryId);
    }





}

package com.kamilyrb.recipe.DataAccess;

import com.kamilyrb.recipe.Entities.Category;

import java.util.List;

public interface ICategoryDal {
    List<Category> getAll();
}

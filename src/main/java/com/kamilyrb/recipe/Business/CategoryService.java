package com.kamilyrb.recipe.Business;

import com.kamilyrb.recipe.DataAccess.ICategoryDal;
import com.kamilyrb.recipe.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    private ICategoryDal categoryDal;

    @Autowired
    public CategoryService(ICategoryDal categoryDal) {
        this.categoryDal = categoryDal;
    }

    @Override
    public List<Category> getAll() {
        return categoryDal.getAll();
    }
}

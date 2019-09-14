package com.kamilyrb.recipe.RestApi;

import com.kamilyrb.recipe.Business.ICategoryService;
import com.kamilyrb.recipe.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    private ICategoryService categoryService;

    @Autowired
    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    @CrossOrigin
    @ResponseBody
    ResponseEntity<Category> getCategories(){
        return new ResponseEntity(categoryService.getAll(), HttpStatus.OK);
    }

}

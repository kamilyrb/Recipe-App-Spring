package com.kamilyrb.recipe.DataAccess.hibernate;

import com.kamilyrb.recipe.DataAccess.IRecipeDal;
import com.kamilyrb.recipe.Entities.Recipe;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateRecipeDal implements IRecipeDal {
    private EntityManager entityManager;

    @Autowired
    public HibernateRecipeDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Recipe> getAll() {
        return null;
    }

    @Override
    @Transactional
    public List<Recipe> getRecipesOfCategory(int categoryId) {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Recipe as r where r.category_id := category_id", Recipe.class).setParameter("category_id",categoryId).list();
    }
}

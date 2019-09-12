package com.kamilyrb.recipe.DataAccess.hibernate;

import com.kamilyrb.recipe.DataAccess.ICategoryDal;
import com.kamilyrb.recipe.Entities.Category;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class HibernateCategoryDal implements ICategoryDal {
    private EntityManager entityManager;

    @Autowired
    public HibernateCategoryDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public List<Category> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return  session.createQuery("from Category", Category.class).list();
    }
}

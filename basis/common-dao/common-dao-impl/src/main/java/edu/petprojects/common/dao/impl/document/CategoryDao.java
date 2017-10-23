package edu.petprojects.common.dao.impl.document;

import edu.petprojects.common.dao.api.dao.AbstractGenericDao;
import edu.petprojects.common.dao.api.entity.document.Category;

import javax.persistence.EntityManagerFactory;

public class CategoryDao extends AbstractGenericDao<Category, Long> {
    public CategoryDao(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, Category.class);
    }
}

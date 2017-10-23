package edu.petprojects.common.dao.impl.document;

import edu.petprojects.common.dao.api.dao.AbstractGenericDao;
import edu.petprojects.common.dao.api.entity.document.Brand;
import edu.petprojects.common.dao.api.entity.document.Category;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class BrandDao extends AbstractGenericDao<Brand, Long>{
    public BrandDao(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, Brand.class);
    }
}

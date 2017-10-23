package edu.petprojects.common.dao.impl.document;

import edu.petprojects.common.dao.api.dao.AbstractGenericDao;
import edu.petprojects.common.dao.api.entity.document.Type;

import javax.persistence.EntityManagerFactory;

public class TypeDao extends AbstractGenericDao<Type, Long> {
    public TypeDao(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, Type.class);
    }
}

package edu.petprojects.common.dao.api;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractGenericDao<T, ID extends Serializable> implements GenericDao<T, ID> {

    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    protected final Class<T> entityClass;

    public AbstractGenericDao(EntityManagerFactory entityManagerFactory, Class<T> entityClass) {
        this.entityManagerFactory = entityManagerFactory;
        this.entityClass = entityClass;
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public T findById(ID id) {
        entityManager.getTransaction().begin();
        T entity = entityManager.find(entityClass, id);
        entityManager.getTransaction().commit();
        return entity;
    }

    @Override
    public T findReferenceById(ID id) {
        return entityManager.getReference(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery =
                entityManager.getCriteriaBuilder().createQuery(entityClass);
        criteriaQuery.select(criteriaQuery.from(entityClass));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Long getCount() {
        CriteriaQuery<Long> c =
                entityManager.getCriteriaBuilder().createQuery(Long.class);
        c.select(entityManager.getCriteriaBuilder().count(c.from(entityClass)));
        return entityManager.createQuery(c).getSingleResult();
    }

    @Override
    public T makePersistence(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    public void makeTransient(T entity) {
        entityManager.remove(entity);
    }

}

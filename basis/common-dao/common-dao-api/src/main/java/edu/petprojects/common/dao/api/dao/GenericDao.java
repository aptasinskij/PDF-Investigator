package edu.petprojects.common.dao.api.dao;

import javax.persistence.LockModeType;
import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, ID extends Serializable> {
    T findById(ID id);
    T findReferenceById(ID id);
    List<T> findAll();
    Long getCount();
    T makePersistence(T entity);
    void makeTransient(T entity);
}

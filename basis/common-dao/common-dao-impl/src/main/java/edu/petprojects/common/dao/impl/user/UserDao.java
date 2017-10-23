package edu.petprojects.common.dao.impl.user;

import edu.petprojects.common.dao.api.dao.AbstractGenericDao;
import edu.petprojects.common.dao.api.entity.user.User;

import javax.persistence.EntityManagerFactory;

public class UserDao extends AbstractGenericDao<User, Long> {

    public UserDao(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, User.class);
    }

}

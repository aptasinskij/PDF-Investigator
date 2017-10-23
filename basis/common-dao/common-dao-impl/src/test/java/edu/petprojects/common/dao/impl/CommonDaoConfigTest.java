package edu.petprojects.common.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.*;

@ContextConfiguration(classes = CommonDaoConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CommonDaoConfigTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void bootstrapTest(){
        assertNotNull(entityManager);
    }

}
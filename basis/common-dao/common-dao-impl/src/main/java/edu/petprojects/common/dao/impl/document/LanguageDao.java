package edu.petprojects.common.dao.impl.document;

import edu.petprojects.common.dao.api.dao.AbstractGenericDao;
import edu.petprojects.common.dao.api.entity.document.Language;

import javax.persistence.EntityManagerFactory;

public class LanguageDao extends AbstractGenericDao<Language, Long> {
    public LanguageDao(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, Language.class);
    }
}

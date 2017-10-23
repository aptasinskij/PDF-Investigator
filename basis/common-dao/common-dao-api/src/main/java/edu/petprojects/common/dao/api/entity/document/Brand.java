package edu.petprojects.common.dao.api.entity.document;

import edu.petprojects.common.dao.api.entity.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Brand extends BaseEntity{

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

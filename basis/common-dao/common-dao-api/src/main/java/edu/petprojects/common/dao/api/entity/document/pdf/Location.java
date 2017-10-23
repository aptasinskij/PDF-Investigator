package edu.petprojects.common.dao.api.entity.document.pdf;

import edu.petprojects.common.dao.api.entity.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Location extends BaseEntity {

    protected String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

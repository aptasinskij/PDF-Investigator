package edu.petprojects.common.dao.api.entity.document.pdf;

import edu.petprojects.common.dao.api.entity.BaseEntity;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class AbstractFile extends BaseEntity{

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(unique = true)
    protected Location location;

    protected Description description;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}

package edu.petprojects.common.dao.api.entity.document.pdf;

import javax.persistence.Entity;

@Entity
public class VisibleFile extends AbstractFile{

    protected Integer traffic = 0;

    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

}

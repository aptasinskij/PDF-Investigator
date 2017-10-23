package edu.petprojects.common.dao.api.entity.document.pdf;

import edu.petprojects.common.dao.api.entity.user.User;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ReviewedFile extends AbstractFile{

    protected long reviewedTime = System.currentTimeMillis();

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(unique = true)
    protected User reviewedBy;

    public User getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(User reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public long getReviewedTime() {
        return reviewedTime;
    }
}

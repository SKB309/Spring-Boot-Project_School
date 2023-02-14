package com.codeline.firstSpringDemo.Models;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Integer baseEntityId;

    @CreatedDate
    Date createDate;
    @UpdateTimestamp
    Date updateDate;
    Boolean isActive;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
//    public Integer getBaseEntityId() {
//        return baseEntityId;
//    }
//
//    public void setBaseEntityId(Integer baseEntityId) {
//        this.baseEntityId = baseEntityId;
//    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

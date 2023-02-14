package com.codeline.firstSpringDemo.Models;

import jdk.jfr.DataAmount;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Entity
public class School extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer schoolId;
    @Column(name = "school_name")
    String nameOfSchool;

    Boolean isActive;

    @Override
    public Boolean getActive() {
        return isActive;
    }

    @Override
    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }


}

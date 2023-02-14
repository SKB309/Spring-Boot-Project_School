package com.codeline.firstSpringDemo.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer studentId;
    String studentName;
    String rollNumber;

    Boolean isActive;

    @Override
    public Boolean getActive() {
        return isActive;
    }

    @Override
    public void setActive(Boolean active) {
        isActive = active;
    }

    @ManyToOne
    @JoinColumn(name = "school_id", referencedColumnName = "schoolId")
    School school;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}

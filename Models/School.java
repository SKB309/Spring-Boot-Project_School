package com.codeline.firstSpringDemo.Models;

import jdk.jfr.DataAmount;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;
@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer schoolId;
@Column(name = "school_name")
    String nameOfSchool;
//@OneToMany
//@JoinColumn(referencedColumnName = "id")
//    List<Student>student;

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

//    public List<Student> getStudent() {
//        return student;
//    }
//
//    public void setStudent(List<Student> student) {
//        this.student = student;
//    }




}

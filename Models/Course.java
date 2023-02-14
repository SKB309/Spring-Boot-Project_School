package com.codeline.firstSpringDemo.Models;

import javax.persistence.*;

@Entity
public class Course extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer courseId;
    String courseName;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "studentId")
    Student student;


    boolean isActive;




    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}

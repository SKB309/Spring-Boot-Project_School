package com.codeline.firstSpringDemo.Service;


import com.codeline.firstSpringDemo.Models.Course;
import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Repositories.CourseRepository;
import com.codeline.firstSpringDemo.Repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses() {

        return courseRepository.getAllCourses();


    }

    public Course getCoursesById(Integer id) {
        Course courses = new Course();

        return courseRepository.getCoursesById(id);
    }


    public Course getByCourseName (String courseName){
        Course course = new Course();

        Course schoolName1= courseRepository.getByCourseName(courseName);
        return courseRepository.getByCourseName(courseName);


    }
}

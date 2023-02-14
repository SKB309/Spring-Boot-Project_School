package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.Course;
import com.codeline.firstSpringDemo.Models.Student;
import com.codeline.firstSpringDemo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "course")

public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "course/getAll", method = RequestMethod.GET)
    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        courses = courseService.getAllCourses();
        return courses;
    }

    @RequestMapping(value = "course/getById", method = RequestMethod.GET)
    public Course getCoursesById(@RequestParam Integer courseId) {
        Course courses = courseService.getCoursesById(courseId);
        return courses;
    }


    @RequestMapping(value = "course/getByName", method = RequestMethod.GET)
    public Course getByCourseName(@RequestParam String courseName) {
        Course courses = courseService.getByCourseName(courseName);
        return courses;
    }

    @RequestMapping(value = "getAllCourseByIsActive", method = RequestMethod.GET)
    public List<Course> getCourseByIsActive(@RequestParam boolean IsActive) {
        List<Course> courses = courseService.getCourseByIsActive(IsActive);
        return courses;

    }



}

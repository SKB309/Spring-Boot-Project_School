package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.Course;
import com.codeline.firstSpringDemo.Models.Mark;
import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Models.Student;
import com.codeline.firstSpringDemo.Repositories.CourseRepository;
import com.codeline.firstSpringDemo.Repositories.MarkRepository;
import com.codeline.firstSpringDemo.Service.CourseService;
import com.codeline.firstSpringDemo.Service.MarkService;
import com.codeline.firstSpringDemo.Service.SchoolService;
import com.codeline.firstSpringDemo.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SalamController {

    @Autowired
    SchoolService schoolService;

    //    School API
    @RequestMapping(value = "school/getAll", method = RequestMethod.GET)
    public List<School> getAllSchools() {
        List<School> schools = new ArrayList<>();
        schools = schoolService.getAllSchools();
        return schools;
    }

    @RequestMapping(value = "school/getById", method = RequestMethod.GET)
    public School getSchoolsById(@RequestParam Integer schoolId) {
        School schools = schoolService.getSchoolsById(schoolId);
        return schools;


    }

    @RequestMapping(value = "school/getByName", method = RequestMethod.GET)
    public School getBySchoolName(@RequestParam String school_name) {

        School school = schoolService.getBySchoolName(school_name);

        return school;

    }

    @Autowired
    StudentServices studentServices;

    //    Student API


    @RequestMapping(value = "student/getAll", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students = studentServices.getAllStudents();
        return students;
    }

    @RequestMapping(value = "student/getById", method = RequestMethod.GET)
    public Student getStudentsById(@RequestParam Integer studentId) {
        Student students = studentServices.getStudentsById(studentId);
        return students;
    }

    @RequestMapping(value = "student/getByName", method = RequestMethod.GET)
    public Student getStudentsByStudentName(@RequestParam String studentName) {
        Student students = studentServices.getStudentsByStudentName(studentName);
        return students;
    }



    @RequestMapping(value = "student/getStudentsBySchoolName", method = RequestMethod.GET)
    public List<Student> getStudentsBySchoolName(@RequestParam String schoolName) {

        return studentServices.getStudentsBySchoolName(schoolName);

    }



    @Autowired
    CourseService courseService;

    //    course API
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

    //
    @Autowired
    MarkService markService;
    MarkRepository markRepository;

    //    Mark API
    @RequestMapping(value = "mark/getAll", method = RequestMethod.GET)
    public List<Mark> getAllMarks() {
        List<Mark> marks = new ArrayList<>();
        marks = markService.getAllMarks();
        return marks;
    }

    @RequestMapping(value = "mark/getById", method = RequestMethod.GET)
    public Mark getMarksById(@RequestParam Integer markId) {
        Mark marks = markService.getMarksById(markId);
        return marks;


    }

    @RequestMapping(value = "mark/getByName", method = RequestMethod.GET)
    public Mark getByMarkName(@RequestParam String grade) {
        Mark marks = markService.getByMarkName(grade);
        return marks;
    }


}






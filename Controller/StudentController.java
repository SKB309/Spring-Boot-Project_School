package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Models.Student;
import com.codeline.firstSpringDemo.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "student")

public class StudentController {

    @Autowired
    StudentServices studentServices;

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


    @RequestMapping(value = "getAllStudentByIsActive", method = RequestMethod.GET)
    public List<Student> getSchoolByIsActive(@RequestParam boolean IsActive) {
        List<Student> students = studentServices.getstudentByIsActive(IsActive);
        return students;

    }


}

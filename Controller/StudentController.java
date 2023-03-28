package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Models.Student;
import com.codeline.firstSpringDemo.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "student")

public class StudentController {

    @Autowired
    StudentServices studentServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students = studentServices.getAllStudents();
        return students;
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Student getStudentsById(@RequestParam Integer studentId) {
        Student students = studentServices.getStudentsById(studentId);
        return students;
    }

    @RequestMapping(value = "getByName", method = RequestMethod.GET)
    public Student getStudentsByStudentName(@RequestParam String studentName) {
        Student students = studentServices.getStudentsByStudentName(studentName);
        return students;
    }


    @RequestMapping(value = "getAllStudentByIsActive", method = RequestMethod.GET)
    public List<Student> getSchoolByIsActive(@RequestParam boolean IsActive) {
        List<Student> students = studentServices.getstudentByIsActive(IsActive);
        return students;

    }

//    @RequestMapping(value = "latestRow", method = RequestMethod.GET)
//    public School getSchoolsByLatestRow() {
//        School latestRow = schoolService.getSchoolsByLatestRow();
//        return latestRow;
//    }
//
//    @RequestMapping(value = "latestUpdated" ,method = RequestMethod.GET)
//    public School getSchoolsByLastUpdate() {
//        School schooly = schoolService.getSchoolsByLastUpdate();
//
//        return  schooly;
//
//    }
//
//
//    @RequestMapping(value = "createdAfter", method = RequestMethod.GET)
//    public List<School> getSchoolsCreatedAfterDate(@RequestParam Date date) {
//        return schoolService.getSchoolCreatedAfterDate(date);
//    }
//
//    @RequestMapping(value = "createdDate" ,method = RequestMethod.GET)
//    public List<School> getSchoolsByCreatedDate(@RequestParam Date date) {
//        return schoolService.getSchoolByCreatedDate(date);
//    }
//
//
//    @RequestMapping(value = "updatedDate" ,method = RequestMethod.GET)
//    public List<School> getSchoolsByUpdatedDate(@RequestParam Date date) {
//        return schoolService.getSchoolByUpdatedDate(date);
//    }


//    @RequestMapping(value = "getSchoolByNumberOfStudent", method = RequestMethod.POST)
//    public List<School> getSchoolByNumberOfStudent(@RequestParam Integer numberOfStudent) {
//        List<School> schoolList = new ArrayList<>();
//        return schoolList;
//    }




}

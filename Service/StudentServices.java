package com.codeline.firstSpringDemo.Service;


import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Models.Student;
import com.codeline.firstSpringDemo.Repositories.SchoolRepository;
import com.codeline.firstSpringDemo.Repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class StudentServices {

    @Autowired
// dependency Injection
//singel ton

    StudentRepositories studentRepositories;

    public void addStudent() {
        Student student = new Student();
//        student.setRollNumber("1");
//        student.setStudentName("Said");
//        studentRepositories.save(student);

//every function call a bean


    }

    @Autowired

    public List<Student> getAllStudents() {

        return studentRepositories.getAllStudents();
    }

    public Student getStudentsById(Integer id) {
        Student student = new Student();

        return studentRepositories.getStudentsById(id);
    }

    public Student getStudentsByStudentName(String studentName) {
        Student student = new Student();

        return studentRepositories.getStudentsByStudentName(studentName);
    }


//    @Autowired
//    StudentRepositories studentRepository;
//
//    public List<Student> getStudentsBySchoolName(String schoolName) {
//        Student student = schoolRepository.getBySchoolName(schoolName);
//        String student = school.getSchoolId();
//        List<Student> studentList = studentRepository.getStudentsBySchoolId(schoolId);
//        return studentList;
//    }

    @Autowired
    SchoolRepository schoolRepository;
    public List<Student> getstudentByIsActive(boolean isActive) {

        List<Student> schoolName = studentRepositories.getstudentByIsActive(isActive);

        return studentRepositories.getstudentByIsActive(isActive);


    }
//
//    public School getSchoolsByLatestRow() {
//        School schoolRow = schoolRepository.getSchoolsByLatestRow();
//        return schoolRepository.getSchoolsByLatestRow();
//    }
//
//    public School getSchoolsByLastUpdate() {
//        School schoolUpdate1 = schoolRepository.getSchoolsByLastUpdate();
//        return schoolRepository.getSchoolsByLastUpdate();
//    }
//
//
//    public List<School> getSchoolCreatedAfterDate(Date date) {
//        return schoolRepository.getSchoolCreatedAfterDate(date);
//    }
//
//    public List<School> getSchoolByCreatedDate(Date date) {
//
//        School school = new School();
//
//        return schoolRepository.getSchoolByCreatedDate(date);
//    }
//
//    public List<School> getSchoolByUpdatedDate(Date date) {
//        School school = new School();
//
//        return schoolRepository.getSchoolByUpdatedDate(date);
//    }


}
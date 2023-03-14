package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;


    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<School> getAllSchools() {
        List<School> schools = new ArrayList<>();
        schools = schoolService.getAllSchools();
        return schools;
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public School getSchoolsById(@RequestParam Integer schoolId) {
        School schools = schoolService.getSchoolsById(schoolId);
        return schools;


    }

    @RequestMapping(value = "getByName", method = RequestMethod.GET)
    public School getBySchoolName(@RequestParam String school_name) {

        School school = schoolService.getBySchoolName(school_name);

        return school;

    }

//    @RequestMapping(value = "school/getAllSchoolByIsActive", method = RequestMethod.GET)
//    public List<School> getSchoolByIsActive(boolean IsActive) {
//        List<School> school = new ArrayList<>();
//        school = schoolService.getSchoolByIsActive(IsActive);
//        return school;
//
//
//    }

    @RequestMapping(value = "getAllSchoolByIsActive", method = RequestMethod.GET)
    public List<School> getSchoolByIsActive(@RequestParam boolean IsActive) {
        List<School> school = schoolService.getSchoolByIsActive(IsActive);
        return school;

    }

    @RequestMapping(value = "latestRow", method = RequestMethod.GET)
    public School getSchoolsByLatestRow() {
        School latestRow = schoolService.getSchoolsByLatestRow();
        return latestRow;
    }

    @RequestMapping(value = "latestUpdated" ,method = RequestMethod.GET)
    public School getSchoolsByLastUpdate() {
        School schooly = schoolService.getSchoolsByLastUpdate();

        return  schooly;

    }


    @RequestMapping(value = "createdAfter", method = RequestMethod.GET)
    public List<School> getSchoolsCreatedAfterDate(@RequestParam Date date) {
        return schoolService.getSchoolCreatedAfterDate(date);
    }

    @RequestMapping(value = "createdDate" ,method = RequestMethod.GET)
    public List<School> getSchoolsByCreatedDate(@RequestParam Date date) {
        return schoolService.getSchoolByCreatedDate(date);
    }


    @RequestMapping(value = "updatedDate" ,method = RequestMethod.GET)
    public List<School> getSchoolsByUpdatedDate(@RequestParam Date date) {
        return schoolService.getSchoolByUpdatedDate(date);
    }

//    @RequestMapping(value = "updateCreatedDateByUserInput")
//    public void setCreatedDateByUserInput(@RequestBody SchoolRequestForCreateDateUpdate data) throws ParseException {
//        schoolService.setCreatedDateByUserInput(data.getDate(), data.getId());
//
//    }

//    @RequestMapping(value = "deleteSchoolById", method = RequestMethod.POST)
//    public void deleteSchoolById(@RequestParam Integer school_id) {
//        schoolService.deleteSchoolById(school_id);
//    }
//
//    @RequestMapping(value = "deleteAll", method = RequestMethod.POST)
//    public void deleteAllSchools() {
//        schoolService.deleteAllSchool();
//    }
//
//    @RequestMapping(value = "deleteSchoolByName", method = RequestMethod.POST)
//    public void deleteSchoolByName(@RequestParam String schoolName) {
//        schoolService.deleteSchoolByName(schoolName);
//    }
//
//    @RequestMapping(value = "deleteSchoolsByCreatedDate", method = RequestMethod.POST)
//    public void deleteSchoolsByCreatedDate(@RequestParam String createdDate) {
//        schoolService.deleteSchoolsByCreatedDate(createdDate);
//    }
//
//    @RequestMapping(value = "deleteSchoolsByUpdatedDate", method = RequestMethod.POST)
//    public void deleteSchoolsByUpdatedDate(@RequestParam String updatedDate) {
//        schoolService.deleteSchoolsByUpdatedDate(updatedDate);
//    }
//
//    @RequestMapping(value = "getSchoolsByCreatedDate", method = RequestMethod.GET)
//    public List<School> getSchoolsByCreatedDate(String createdDate) throws ParseException {
//        List<School> schools = schoolService.getSchoolsByCreatedDate(createdDate);
//        return schools;
//    }
//
//    @RequestMapping(value = "getSchoolsByUpdatedDate", method = RequestMethod.GET)
//    public List<School> getSchoolsByUpdatedDate(String updatedDate) throws ParseException {
//        List<School> schools = schoolService.getSchoolsByUpdatedDate(updatedDate);
//        return schools;
//    }
//
//    @RequestMapping(value = "updateSchool", method = RequestMethod.POST)
//    public void updateSchool(@RequestParam Integer schoolId, String schoolName, Boolean isActive) {
//        schoolService.updateSchool(schoolId, schoolName, isActive);
//    }
//
//    @RequestMapping(value = "deleteAllSchoolsCreatedAfterDate", method = RequestMethod.POST)
//    public void deleteAllSchoolsCreatedAfterDate(@RequestParam String createdDate) throws ParseException {
//        schoolService.deleteAllSchoolsCreatedAfterDate(createdDate);
//    }
//
//    @RequestMapping(value = "getSchoolByNumberOfStudents", method = RequestMethod.GET)
//    public List<School> getSchoolByNumberOfStudents(@RequestParam Integer numberOFStudents) {
//        List<School> schoolList = schoolService.getSchoolByNumberOfStudent(numberOFStudents);
//        return schoolList;
//    }
}













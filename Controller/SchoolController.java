package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;


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

}

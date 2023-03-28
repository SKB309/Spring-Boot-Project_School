package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Service.SchoolService;
import com.codeline.firstSpringDemo.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;
    @Autowired
    SlackClient slackClient;


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
//school_name ,getByName ,getBySchoolName
@RequestMapping(value = "getByName")
public School getBySchoolName(@RequestParam String school_name) {
           School school =  schoolService.getBySchoolName(school_name);

//    for(School s : school) {
        slackClient.sendMessage("The Name of the School is :" + school.getNameOfSchool());
        slackClient.sendMessage(school.getIsActive().toString());
        slackClient.sendMessage(school.getCreateDate().toString());
        slackClient.sendMessage(school.getUpdateDate().toString());
        slackClient.sendMessage(school.getCreateDate().toString());
//    }
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
@RequestMapping(value = "getAllSchoolByIsActive")
public List<School> getSchoolByIsActive(@RequestParam boolean isActive) {
    List<School> activeSchoolsList = schoolService.getSchoolByIsActive(isActive);
    for(School s:activeSchoolsList){
        slackClient.sendMessage("SlackMessage_SchoolInActive:"+s.getActive().toString());
        slackClient.sendMessage("slackMessage_SchoolId:"+s.getSchoolId().toString());
        slackClient.sendMessage("slackMessage_SchoolName:"+s.getNameOfSchool().toString());
        slackClient.sendMessage("slackMassage_SchoolCreatedDate"+s.getCreateDate());
        slackClient.sendMessage("slackMassage_SchoolUpdatedDate"+s.getUpdateDate());

    }
    return activeSchoolsList;
}

    @RequestMapping(value = "getAllSchoolByIsUnActive")
    public List<School> getAllInActiveSchools(@RequestParam boolean unActive) {
        List<School> unActiveSchoolsList = schoolService.getUnActive(unActive);
        for(School s:unActiveSchoolsList){
            slackClient.sendMessage("SlackMessage_SchoolInActive:"+s.getActive().toString());
            slackClient.sendMessage("slackMessage_SchoolId:"+s.getSchoolId().toString());
            slackClient.sendMessage("slackMessage_SchoolName:"+s.getNameOfSchool().toString());
            slackClient.sendMessage("slackMassage_SchoolCreatedDate"+s.getCreateDate());
            slackClient.sendMessage("slackMassage_SchoolUpdatedDate"+s.getUpdateDate());


        }

        return unActiveSchoolsList;
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

    @RequestMapping(value="createdDate",method = RequestMethod.GET)
    public List<School> getSchoolByCreatedDate(@RequestParam Date createdDate){

        School school=new School();
        slackClient.sendMessage("SlackMessage_SchoolCreateDate:"+school.getCreateDate().toString());

        return schoolService.getSchoolByCreatedDate(createdDate);
    }
//    @RequestMapping(value = "createdDate" ,method = RequestMethod.GET)
//    public List<School> getSchoolsByCreatedDate(@RequestParam Date date) {
//        return schoolService.getSchoolByCreatedDate(date);
//    }


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













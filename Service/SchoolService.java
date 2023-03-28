package com.codeline.firstSpringDemo.Service;

import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;



    public List<School> getAllSchools() {

        return schoolRepository.getAllSchools();


    }

    public School getSchoolsById(Integer id) {
        School school = new School();

        return schoolRepository.getSchoolsById(id);

    }


    public School getBySchoolName(String school_name) {
        School school = new School();

        School schoolName1 = schoolRepository.getBySchoolName(school_name);
        return schoolRepository.getBySchoolName(school_name);


    }

    public List<School> getSchoolByIsActive(boolean isActive) {

        List<School> schoolName = schoolRepository.getSchoolByIsActive(isActive);

        return schoolRepository.getSchoolByIsActive(isActive);


    }

    public List<School> getUnActive(boolean unActive) {

        School school = new School();

        List<School> schoolName = schoolRepository.getSchoolByUnActive(unActive);

        return schoolRepository.getSchoolByUnActive(unActive);


    }

    public School getSchoolsByLatestRow() {
        School schoolRow = schoolRepository.getSchoolsByLatestRow();
        return schoolRepository.getSchoolsByLatestRow();
    }

    public School getSchoolsByLastUpdate() {
        School schoolUpdate1 = schoolRepository.getSchoolsByLastUpdate();
        return schoolRepository.getSchoolsByLastUpdate();
    }


    public List<School> getSchoolCreatedAfterDate(Date date) {
        return schoolRepository.getSchoolCreatedAfterDate(date);
    }

    public List<School> getSchoolByCreatedDate(Date date) {

        List<School> schools=schoolRepository.getSchoolByCreatedDate(date);
        return schools;
    }

    public List<School> getSchoolByUpdatedDate(Date date) {
        School school = new School();

        return schoolRepository.getSchoolByUpdatedDate(date);
    }




//    public List<School> getSchoolByNumberOfStudent(Integer numberOfStudent){
//        List<Integer> typesOfSchoolIdsInStudent = studentRepository.getDistinctSchoolIdsFromStudent();
//        //{1,2 }
//
//        Integer schoolIdThatUserWants = 0;
//
//        for (Integer idOfSchool: typesOfSchoolIdsInStudent) {
//            Integer count = studentRepository.getCountOfStudentsBySchoolId(idOfSchool);
//
//            if(numberOfStudent == count) {
//                schoolIdThatUserWants = idOfSchool;
//                break;
//            }
//        }
//
//        School schoolThatUserWasLookingFor = schoolRepository.getSchoolById(schoolIdThatUserWants);
//
//    }

//    public void setCreatedDateByUserInput(String stringData, Integer id) throws ParseException {
//
//        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date javaDate = formatter.parse(stringData);
//        School school = schoolRepository.getSchoolsById(id);
//        school.setCreateDate(javaDate);
//        schoolRepository.save(school);
//
//    }

//    public void deleteSchoolById(Integer school_id) {
//        School school = schoolRepository.getSchoolById(school_id);
//        school.setActive(false);
//        schoolRepository.save(school);
//    }
//
//    public void deleteAllSchool() {
//        schoolRepository.deleteAllSchoolsByIsActiveFalse();
//    }
//
//    public void deleteSchoolByName(String schoolName) {
//        School school = schoolRepository.getSchoolByName(schoolName);
//        school.setIsActive(false);
//        schoolRepository.save(school);
//    }
//
//    public List<School> getSchoolsByCreatedDate(String createdDate) {
//        List<School> schools = schoolRepository.getSchoolsByCreatedDate(createdDate);
//        return schools;
//    }
//
//    public List<School> getSchoolsByUpdatedDate(String updatedDate) {
//        List<School> schools = schoolRepository.getSchoolsByUpdatedDate(updatedDate);
//        return schools;
//    }
//
//    public void deleteSchoolsByCreatedDate(String createdDate) {
//        List<School> schoolList = schoolRepository.getSchoolsByCreatedDate(createdDate);
//        schoolList.stream().forEach(x -> x.setIsActive(false));
//        schoolRepository.saveAll(schoolList);
//    }
//
//    public void deleteSchoolsByUpdatedDate(String updatedDate) {
//        List<School> schools = schoolRepository.getSchoolsByUpdatedDate(updatedDate);
//        schools.stream().forEach(x -> x.setIsActive(false));
//        schoolRepository.saveAll(schools);
//    }
//
//    public void updateSchool(Integer schoolId, String schoolName, Boolean isActive) {
//        School school = schoolRepository.getSchoolById(schoolId);
//        school.setSchoolName(schoolName);
//        school.setIsActive(isActive);
//        schoolRepository.save(school);
//    }
//
//    public void deleteAllSchoolsCreatedAfterDate(String createdDate) throws ParseException {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date formatedDate = dateFormat.parse(createdDate);
//        List<School> schoolList = schoolRepository.getSchoolCreatedAfterDate(formatedDate);
//        schoolList.stream().forEach(r -> r.setIsActive(false));
//        schoolRepository.saveAll(schoolList);
//
//    }




}










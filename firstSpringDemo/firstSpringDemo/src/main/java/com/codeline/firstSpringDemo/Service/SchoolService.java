package com.codeline.firstSpringDemo.Service;

import com.codeline.firstSpringDemo.Models.Mark;
import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    public School getBySchoolName (String school_name){
        School school = new School();

        School schoolName1= schoolRepository.getBySchoolName(school_name);
        return schoolRepository.getBySchoolName(school_name);


    }

}

package com.codeline.firstSpringDemo.Repositories;


import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositories extends CrudRepository<Student, Integer> {

    @Query(value = "SELECT s from Student s")
    List<Student> getAllStudents();

    @Query(value = "SELECT s from Student s where s.id = :studentId")
    Student getStudentsById(@Param("studentId") Integer id);


    @Query(value = "SELECT s FROM Student s where s.studentName = :studentName ")
    Student getStudentsByStudentName(@Param("studentName") String studentName);


    @Query(value = "SELECT st from Student st " +
            "WHERE st.school.id = :id ")
    List<Student> getStudentsBySchoolId(@Param("id") Integer id);


}



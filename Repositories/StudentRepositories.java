package com.codeline.firstSpringDemo.Repositories;


import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
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


    @Query(value = "SELECT s from Student s where s.isActive = :isActive")
    List<Student> getstudentByIsActive(@Param("isActive") boolean isActive);

    @Query(value = "SELECT  *  FROM  school  WHERE  create_date = (select Max(create_date) from  school )", nativeQuery = true)
    School getSchoolsByLatestRow();

    @Query(value = "SELECT MAX(update_date) FROM school", nativeQuery = true)
    School getSchoolsByLastUpdate();
    //
//// (SELECT MAX(t2.lastUpdated) FROM MyTable t2)
//
    @Query(value = "SELECT * FROM school WHERE create_date > update_date" ,nativeQuery = true)
    List<School> getSchoolCreatedAfterDate(@Param("date") Date date);

    @Query(value = "SELECT * FROM school WHERE create_date = date" , nativeQuery = true)
    List<School> getSchoolByCreatedDate(@Param("date") Date date);

    @Query(value = "SELECT * FROM school WHERE update_date = date" , nativeQuery = true)
    List<School> getSchoolByUpdatedDate(@Param("date") Date date);

}



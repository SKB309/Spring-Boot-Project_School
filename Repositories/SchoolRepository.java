package com.codeline.firstSpringDemo.Repositories;

import com.codeline.firstSpringDemo.Models.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {


    @Query(value = "SELECT s from School s")
    List<School> getAllSchools();

    @Query(value = "SELECT s from School s where s.id = :schoolId")
    School getSchoolsById(@Param("schoolId") Integer id);


    @Query(value = "SELECT s from School s where s.nameOfSchool = :school_name")
    School getBySchoolName(@Param("school_name") String school_name);

    @Query(value = "SELECT s from School s where s.isActive = :isActive")
    List<School> getSchoolByIsActive(@Param("isActive") boolean isActive);

    @Query(value = "SELECT  *  FROM  school  WHERE  create_date = (select Max(create_date) from  school )", nativeQuery = true)
    School getSchoolsByLatestRow();

    @Query(value = "SELECT MAX(update_date) FROM school", nativeQuery = true)
    School getSchoolsByLastUpdate();
//
//// (SELECT MAX(t2.lastUpdated) FROM MyTable t2)
//
    @Query(value = "SELECT * FROM school WHERE create_date > update_date" ,nativeQuery = true)
    List<School> getSchoolCreatedAfterDate(@Param("date") Date date);

    @Query(value = "select * from school where create_date like CONCAT (?1, '%') ", nativeQuery = true)
    List<School> getSchoolByCreatedDate(@Param("date") Date date);

    @Query(value = "SELECT * FROM school WHERE update_date = date" , nativeQuery = true)
    List<School> getSchoolByUpdatedDate(@Param("date") Date date);



//    @Query(value = "SELECT DISTINCT school_id FROM student", nativeQuery = true)
//    List<Integer> getDistinctSchoolIdsFromStudent();
//
//    @Query(value = "SELECT COUNT(id) From student where school_id = :?1", nativeQuery = true)
//    Integer getCountOfStudentsBySchoolId(Integer schoolId);

//    @Query("SELECT * FROM school WHERE number_of_students BETWEEN :minStudents AND :maxStudents;")
//    List<School> getSchoolByNumberOfStudents(int numberOfStudents);



//    @Query(value = "DELETE s from School s")
//    List<School> deleteAllSchoolsByIsActiveFalse();
//
//    @Query("DELETE FROM School s WHERE s.createdDate > :date")
//    School getSchoolsByUpdatedDate(@Param("date") Date date);
//
//    @Query(value = "DELETE s from School s where s.nameOfSchool = :school_name")
//    School (@Param("school_name") String school_name);
//
//
//
//    @Query("DELETE FROM School s WHERE s.createdDate = :date")
//    School deleteSchoolsByCreatedDate(@Param("date") Date date);
//
//
//    @Query("DELETE FROM School s WHERE s.updatedDate = :date")
//    School deleteSchoolsByUpdatedDate(@Param("date") Date date);


}

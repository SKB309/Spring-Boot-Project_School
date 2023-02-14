package com.codeline.firstSpringDemo.Repositories;

import com.codeline.firstSpringDemo.Models.Course;
import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

    @Query(value = "SELECT c from Course c")
    List<Course> getAllCourses();


    @Query(value = "SELECT s from Course s where s.id = :courseId")
    Course getCoursesById(@Param("courseId") Integer id);

    @Query(value = "SELECT s from Course s where s.courseName = :courseName")
    Course getByCourseName(@Param("courseName") String courseName);


    @Query(value = "SELECT s from Course s where s.isActive = :isActive")
    List<Course> getCourseByIsActive(@Param("isActive") boolean isActive);

}



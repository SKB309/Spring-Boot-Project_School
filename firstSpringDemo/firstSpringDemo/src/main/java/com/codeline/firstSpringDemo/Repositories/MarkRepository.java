package com.codeline.firstSpringDemo.Repositories;

import com.codeline.firstSpringDemo.Models.Course;
import com.codeline.firstSpringDemo.Models.Mark;
import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepository extends CrudRepository<Mark, Integer> {
    @Query(value = "SELECT s from  Mark s")
    List<Mark> getAllMarks();


    @Query(value = "SELECT s from Mark s where s.id = :markId")
    Mark getMarksById(@Param("markId") Integer id);

    @Query(value = "SELECT s from Mark s where s.grade = :grade")
    Mark getByMarkName(@Param("grade") String grade);

}




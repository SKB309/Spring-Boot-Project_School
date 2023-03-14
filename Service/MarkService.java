package com.codeline.firstSpringDemo.Service;

import com.codeline.firstSpringDemo.Models.Course;
import com.codeline.firstSpringDemo.Models.Mark;
import com.codeline.firstSpringDemo.Models.School;
import com.codeline.firstSpringDemo.Repositories.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class MarkService {
    @Autowired
    MarkRepository markRepository;

    public List<Mark> getAllMarks() {
        return markRepository.getAllMarks();
    }


    public Mark getMarksById(Integer id) {
        Mark marks = new Mark();

        return markRepository.getMarksById(id);
    }

    public Mark getByMarkName (String grade){
        Mark marks = new Mark();

        return markRepository.getByMarkName(grade);


    }


}

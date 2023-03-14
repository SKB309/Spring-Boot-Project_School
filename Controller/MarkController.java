package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.Mark;
import com.codeline.firstSpringDemo.Service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "mark")

public class MarkController {


    @Autowired
    MarkService markService;


    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Mark> getAllMarks() {
        List<Mark> marks = new ArrayList<>();
        marks = markService.getAllMarks();
        return marks;
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Mark getMarksById(@RequestParam Integer markId) {
        Mark marks = markService.getMarksById(markId);
        return marks;


    }

    @RequestMapping(value = "getByName", method = RequestMethod.GET)
    public Mark getByMarkName(@RequestParam String grade) {
        Mark marks = markService.getByMarkName(grade);
        return marks;
    }




}

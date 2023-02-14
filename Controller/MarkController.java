package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.Mark;
import com.codeline.firstSpringDemo.Service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "mark")

public class MarkController {


    @Autowired
    MarkService markService;


    @RequestMapping(value = "mark/getAll", method = RequestMethod.GET)
    public List<Mark> getAllMarks() {
        List<Mark> marks = new ArrayList<>();
        marks = markService.getAllMarks();
        return marks;
    }

    @RequestMapping(value = "mark/getById", method = RequestMethod.GET)
    public Mark getMarksById(@RequestParam Integer markId) {
        Mark marks = markService.getMarksById(markId);
        return marks;


    }

    @RequestMapping(value = "mark/getByName", method = RequestMethod.GET)
    public Mark getByMarkName(@RequestParam String grade) {
        Mark marks = markService.getByMarkName(grade);
        return marks;
    }


}

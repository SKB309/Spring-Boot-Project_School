package com.codeline.firstSpringDemo.Controller;

import com.codeline.firstSpringDemo.Models.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralConroller {

    @Autowired
    SlackClient slackClient;

    @GetMapping(value = "test")
    public String test(){
        return "${spring.profiles.active}";
    }

    @GetMapping(value = "slackMessage")
    public void message(@RequestParam String text){
        slackClient.sendMessage(text);
    }
}

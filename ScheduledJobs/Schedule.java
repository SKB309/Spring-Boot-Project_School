package com.codeline.firstSpringDemo.ScheduledJobs;


import com.codeline.firstSpringDemo.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Autowired
    SlackClient slackClient;

    @Scheduled(cron = "*/5****")
    public void alertSlack(){
//        Get Functions for School , Student , Course , Marks


    }
}

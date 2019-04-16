package com.ryanbytheway.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    private FortuneService fortuneService;
    @Value("${coach.email}")
    private String email;
    @Value("${coach.name}")
    private String name;

    @Autowired
    public FootballCoach (@Qualifier("RESTFortuneService")FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice dribbling around cones";
    }

    @Override
    public String getDailyMessage() {
        return "FootballCoach: " + fortuneService.getFortuneMessage();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

}

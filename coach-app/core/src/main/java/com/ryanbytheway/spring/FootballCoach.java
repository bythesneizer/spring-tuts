package com.ryanbytheway.spring;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice dribbling around cones";
    }

    @Override
    public void getDailyMessage() {

    }
}

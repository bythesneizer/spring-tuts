package com.ryanbytheway.spring;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Serving practice for 30 minutes";
    }

    @Override
    public void getDailyMessage() {

    }
}

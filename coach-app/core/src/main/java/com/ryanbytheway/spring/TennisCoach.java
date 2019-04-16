package com.ryanbytheway.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Serving practice for 30 minutes";
    }

    @Override
    public String getDailyMessage() {
        return "TennisCoach: " + fortuneService.getFortuneMessage();
    }
}

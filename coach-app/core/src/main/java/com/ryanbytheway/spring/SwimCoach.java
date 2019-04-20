package com.ryanbytheway.spring;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 metres front crawl";
    }

    @Override
    public String getDailyMessage() {
        return fortuneService.getFortuneMessage();
    }
}

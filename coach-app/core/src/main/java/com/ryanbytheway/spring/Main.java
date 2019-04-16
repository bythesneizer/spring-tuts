package com.ryanbytheway.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("INFO MESSAGE IN MAIN");
        logger.debug("DEBUG MESSAGE IN MAIN");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach coach  = context.getBean("tennisCoach", Coach.class);
        Coach coachA  = context.getBean("tennisCoach", Coach.class);
        Coach coach1 = context.getBean("footballCoach", FootballCoach.class);
        Coach coach1A = context.getBean("footballCoach", FootballCoach.class);

        logger.info("Memory location for coach: " + coach);
        logger.info("Memory location for coachA: " + coachA);
        logger.info("Memory location for coach1: " + coach1);
        logger.info("Memory location for coach1A: " + coach1A);

        logger.info(coach.getDailyWorkout());
        logger.info(coach1.getDailyWorkout());
        logger.info(coach.getDailyMessage());
        logger.info(coach1.getDailyMessage());

        context.close();
    }
}

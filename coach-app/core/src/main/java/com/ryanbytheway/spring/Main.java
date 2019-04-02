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

        logger.info(coach.getDailyWorkout());

        context.close();
    }
}

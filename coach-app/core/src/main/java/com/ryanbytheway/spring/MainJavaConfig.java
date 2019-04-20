package com.ryanbytheway.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJavaConfig {

    private static final Logger logger = LoggerFactory.getLogger(MainJavaConfig.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Coach coach  = context.getBean("swimCoach", Coach.class);

        logger.info(coach.getDailyWorkout());

        logger.info(coach.getDailyMessage());

        context.close();
    }
}

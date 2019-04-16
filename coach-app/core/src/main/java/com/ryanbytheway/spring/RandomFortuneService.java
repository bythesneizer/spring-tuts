package com.ryanbytheway.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @Value("${fortune.messages}")
    private String[] messages;

    private Random random = new Random();

    @Override
    public String getFortuneMessage() {
        int index = random.nextInt(messages.length);
        return messages[index];
    }
}

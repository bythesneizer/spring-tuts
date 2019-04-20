package com.ryanbytheway.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @Value("${fortune.messages}")
    private String[] messages;

    private Random random = new Random();

    @PostConstruct
    public void listFortuneMessages(){
        for(int i = 0; i<messages.length; i++){
            System.out.println(messages[i]);
        }
    }

    @Override
    public String getFortuneMessage() {
        int index = random.nextInt(messages.length);
        return messages[index];
    }
}

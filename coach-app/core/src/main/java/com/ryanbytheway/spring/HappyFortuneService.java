package com.ryanbytheway.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortuneMessage() {
        return "You will have much luck today";
    }
}

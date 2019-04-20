package com.ryanbytheway.spring;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortuneMessage() {
        return "Today is not going to be your day";
    }
}

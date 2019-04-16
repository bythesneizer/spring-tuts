package com.ryanbytheway.spring;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortuneMessage() {
        return "REST";
    }
}

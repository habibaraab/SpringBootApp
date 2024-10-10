package com.spring.springbootCore.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Cricket Coach";
    }
}

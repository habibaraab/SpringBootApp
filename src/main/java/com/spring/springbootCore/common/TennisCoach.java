package com.spring.springbootCore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Tennis Coach";
    }

}

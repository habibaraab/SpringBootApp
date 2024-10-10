package com.spring.springbootCore.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BasketCoach implements Coach {

    public String getDailyWorkout() {

        return "Practical Basket";
    }
}

package com.spring.springbootCore.rest;

import com.spring.springbootCore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    @Autowired
    public DemoController( Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailywork")
    public String sayHello() {

        return coach.getDailyWorkout();
    }
}

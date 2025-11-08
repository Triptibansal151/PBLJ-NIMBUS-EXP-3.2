package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This tells Spring this is a configuration class (like XML in old versions)
@Configuration
public class AppConfig {

    // Define a Course bean
    @Bean
    public Course course() {
        return new Course("Spring Framework");
    }

    // Define a Student bean, and inject the Course bean into it
    @Bean
    public Student student() {
        return new Student(course());
    }
}

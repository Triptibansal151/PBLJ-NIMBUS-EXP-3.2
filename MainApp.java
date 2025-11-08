package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Create Spring container using Java configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Ask Spring to give us the Student bean
        Student student = context.getBean(Student.class);

        // Call the method to see if dependency injection worked
        student.showDetails();
    }
}

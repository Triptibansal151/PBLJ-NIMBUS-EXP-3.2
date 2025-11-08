package com.example;

// Student class depends on Course
public class Student {
    private Course course;

    // Constructor-based dependency injection
    public Student(Course course) {
        this.course = course;
    }

    // Method to display student info
    public void showDetails() {
        System.out.println("Student Details:");
        course.showCourse();  // calls method from Course class
    }
}

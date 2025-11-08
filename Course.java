package com.example;

// Simple class representing a Course
public class Course {
    private String courseName;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Method to display course info
    public void showCourse() {
        System.out.println("Course Enrolled: " + courseName);
    }
}

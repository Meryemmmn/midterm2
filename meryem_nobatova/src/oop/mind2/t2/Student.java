package oop.mind2.t2;

import java.util.List;

public class Student {
    private String name;
    private List<LearningCourse> courses;

    public Student(String name, List<LearningCourse> courses) {
        this.name = name;
        this.courses = courses;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<LearningCourse> getCourses() {
        return courses;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(List<LearningCourse> courses) {
        this.courses = courses;
    }
}

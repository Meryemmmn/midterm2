package oop.mind2.t2;

import java.util.List;

public class UMS {
    private List<Student> students;

    public UMS(List<Student> students) {
        this.students = students;
    }

    public void printStudentData(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Enrolled Courses:");
        for (LearningCourse course : student.getCourses()) {
            System.out.println(course);
        }
    }
}

package oop.mind2.t2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LearningCourse course1 = new LearningCourse(
            "MATH151 Calculus 2",
            "MATH150 Calculus 1",
            "Antiderivatives, Definite integrals, Techniques and applications of integration, Improper Integrals, Infinite series"
        );

        LearningCourse course2 = new LearningCourse(
            "CS211 Object Oriented Programming",
            "CS50 Introduction to Programming",
            "Java syntax and data structures, Procedural programming, Classes, Encapsulation, Polymorphism, Inheritance, Packages, Working with the network, Work with text data, Work with the terminal"
        );

        LearningCourse course3 = new LearningCourse(
            "DE111 Computer Organization",
            "CS50 Introduction to Programming ",
            "Representing and manipulating information, Machine-level representations of programs, Optimizing program performance, The memory Hierarchy"
        );

        LearningCourse course4 = new LearningCourse(
            "DE112 Mathematical Foundation of Computing",
            "CS50 Introduction to Programming, MATH150 Calculus 1 ",
            "Mathematical Logic, Elements of Discrete Math, Elements of Sets Theory, Elements of Graph Theory, Elements of Combinatorics, Elements of Digital Systems"
        );

        LearningCourse course5 = new LearningCourse(
            "SO58 Practical course of Georgian for Foreigners (A1.1b)",
            "R576 Practical course of Georgian for Foreigners (A1.1a) ",
            "Appearance, Parts of the body, Clothes anad everyday objects, Countries, Nationalities, Time, Seasons, House/flat, Desire and Ability" );

        
        Student me = new Student("Meryem Nobatova", Arrays.asList(course1, course2, course3, course4, course5 ));

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(me);

        UMS ums = new UMS(studentList);
        ums.printStudentData(me);
    }
}

package java2.Collections;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;  //generic array is better bec its specific to what input it can take in-no primitive types

    public Student(String name) {          // this is constructor --so Must be public
        this.name = name;
        this.grades = new ArrayList<>();  // setting up ArrayList
    }

    // returns the student's name //------------------getter
    public String getName() {
        return name;          // can return null if dont know what to return at first
    }

    // add the given grade to the grades property //-------------
    public void addGrade(int grade) {  grades.add(grade); }             //adding grade to the student


    public double getGradeAverage() {

        int sum =0;
        for (Integer grade:grades) { sum += grade; } return (double)sum /grades.size();}


} //end class student

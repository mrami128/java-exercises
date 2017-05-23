package java2.Collections;

import java.util.Scanner;
import java.util.ArrayList;


public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {          // this is constructor --so Must be public
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
        System.out.println();
        for (Integer num: grades) {
            System.out.println(num);
        }
    }

    // returns the average of the students grades
    public double getGradeAverage() {

        int entrySize = grades.size();
        int gradeEntries = 0;
        double average = 0;

        for (Integer num: grades) {
            gradeEntries += num;
        }
        average = gradeEntries / entrySize;
        return average;
    }

//----------------------------------------------

    public static void main(String[] args) {

        String yesNo;


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter student name:");
                String name = sc.nextLine();
                Student student = new Student(name);

        do {
            System.out.println("Enter students grade: ");
            int grade = sc.nextInt();
            student.addGrade(grade);

            sc.nextLine();
            System.out.println("Enter another grade?");
            yesNo = sc.nextLine();

        } while (yesNo.equalsIgnoreCase("Y"));

        System.out.println(name);                       //Why do both of these work?
        System.out.println(student.getName());
        System.out.println(student.getGradeAverage());


    } // end psvm main

} //end class student

package java2.Collections;

import java.util.Scanner;
import java.util.ArrayList;


public class Student {

    private String name;
    private ArrayList<Integer> grades;  //generic array is better bec its specific to what input it can take in-no primitive types

    public Student(String name) {          // this is constructor --so Must be public
        this.name = name;
        this.grades = new ArrayList<>();  //
    }

    // returns the student's name //------------------
    public String getName() {
        return name;          // can return null if dont know what to return at first
    }

    // add the given grade to the grades property //-------------
    public void addGrade(int grade) {  grades.add(grade); }             //adding grade to the student

//        System.out.println();
//        for (Integer num: grades) {
//            System.out.println(num);
//        }


    // returns the average of the students grades
    public double getGradeAverage() {

        int sum =0;
        for (Integer grade:grades) {sum+=grade;} return (double)sum /grades.size();}

//        int entrySize = grades.size();
//        int gradeEntries = 0;
//        double average = 0;
//
//        for (Integer num : grades) {
//            gradeEntries += num;
//        }
//        average = gradeEntries / entrySize;
//        return average;
//        }
//----------------------------------------------

    public static void main(String[] args) {
    //--------
     Student student1 =new Student("zach");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);
        System.out.println("student 1 avg : " + student1.getGradeAverage());

     Student student2 =new Student("ben");
        student2.addGrade(100);
        student2.addGrade(90);
        student2.addGrade(80);
        System.out.println("\nstudent 2 avg : " + student2.getGradeAverage());


        //-------
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

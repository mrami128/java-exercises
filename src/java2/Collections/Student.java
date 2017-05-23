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

        Student student = new Student("everardo");

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter students grade: ");
            int grade = sc.nextInt();
            student.addGrade(grade);

            sc.nextLine();
            System.out.println("Enter another grade?");
            yesNo = sc.nextLine();

        } while (yesNo.equalsIgnoreCase("Y"));

        System.out.println(student.getGradeAverage());
    }

}

//--------------------------
//public class Student {
//
//    private String name;
//    private ArrayList<Integer>grade;     //private int grade;
//
//    public Student(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
////    public int getGrade() {
////        return grade;
//
//
//
//    // adds the given grade to the grades property
//    public void addGrade(int grade) {
//
//
//        //cycle through int list adding int for student total divided by quantity of grade
//
//        ArrayList<Integer> getGrade = new ArrayList<>();
//        getGrade.add(20);
//        getGrade.add(21);
//        getGrade.add(22);
//        System.out.println(getGrade.size()); // integ length
//
//    }
////    // returns the average of the students grades
////    public double getGradeAverage(){
////      return
////    };
//
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("enter Student name");
//
//        String studentName = scan.nextLine();
//
//
//    }//end main
//} //end class
//

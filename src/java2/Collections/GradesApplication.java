package java2.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
      String yesNo;   // relates to do you want to see another studen

      Map<String, Student> students = new HashMap<>();

        Student student1 = new Student("Fernando ");
        student1.addGrade(80);
        student1.addGrade(90);

        Student student2 = new Student("Justin ");
        student2.addGrade(100);
        student2.addGrade(78);
        student2.addGrade(90);

        students.put("fernando", student1);
        students.put("justin", student2);

// ? where to start and end the   do / while loop --------
do{
        System.out.println("Welcome!");
        System.out.println(" here are the github username of students:");

        students.forEach((username, student) -> System.out.print(" | " + username + " | "));

    System.out.println("\nenter a student username:");
        Scanner input = new Scanner(System.in);
        String username = input.next();


        if (!students.containsKey(username)) {              // this looks for bool to see if true or false

            System.out.println("Sorry no student found with this name. ");

        } else {
            Student student = students.get(username);
            System.out.println("\nname: " + student.getName() + " --> git user name is: " + username);
            System.out.println("curr avg : " + student.getGradeAverage());
        }
    System.out.println("\nWould yu like to see another student y-n");
    yesNo = input.next();

} while ("y".equalsIgnoreCase(yesNo));
        System.out.println("Goodbye have good day");

    }//end psvm

} // end class gradesApplication


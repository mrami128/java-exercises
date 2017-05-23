package java2.Collections;

import java.util.Scanner;

/**
 * Created by user on 5/22/17.
 */
public class StudentTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter Student name");
            String studentName = scan.nextLine();

        System.out.println("enter Student grades");
            int studentGrade = scan.nextInt();

        System.out.println(" add more grades y/n ? :");
            boolean moreGrades = scan.nextBoolean();

if (moreGrades == true){
    System.out.println(" ok..add next grade");
}
        System.out.println("The average for: " +studentName+" is: "+studentGrade);;

            //    while(true) {
//
//        switch (input.nextInt()) {
//            case 0:
//                System.out.println("Exiting Now");
//                System.exit(0);
//                break;
//            case 1:
////                for (Movie m : listOfMovies){
////                    System.out.println(m.getName()+"-"+m.getCategory() );
//                break;
//                }
//                System.out.println("Case 1");
//
////                for (Movie m : listOfMovies) {
////                    if (m.getCategory().equalsIgnoreCase("animated")) {
////                        System.out.println(m.getName() + "-" + m.getCategory());
//                        break;
//                    }
//                }
//            case 2:
//                System.out.println("Case 2");
//                break;



    }
}

package io;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by user on 5/10/17.
 */
public class loopExerMay10 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // new Scanner obj call it 'scan'

        ////========================
//        System.out.println( " The FizzBuzz GAME");
//        System.out.println( " print 1-100");
//
//        for( int i=1;  i<=100; i++ ){
//            if(i %3 ==0 && i %5 ==0) {
//                System.out.println(" FizzBuzz ninja!");
//                continue;
//            }
//            if(i %3 == 0){
//                System.out.println("fizz");
//                continue;
//            }
//            if(i %5 == 0){
//                System.out.println("buzz");
//                continue;
//            }
//                System.out.println(i);
//        }//end for

// //================================================ Review ENTERING Number  int
//        System.out.println(" enter a number - integer ");
//              int numbr = scan.nextInt();
//              System.out.println("The integer you entered is: " + numbr);
//
// //================================================Review ENTER Word  String
//        System.out.println("1.Hello  enter word 1 of 3");
//        String w1 = scan.next();
//            // next only gets first word..VERSUS nextline that gets the whole sentence
//
//        System.out.println(" word 1"+w1);
////===================================

String wantsToContinue;
    do {
        System.out.println("Enter number you'd like to go up to:");
        int limit = scan.nextInt();
        System.out.println("here is your table for numbr: " + limit);
        System.out.println();

        System.out.println("number          squared     cubed ");
        System.out.println("------------|-------------|----------------");

        for (int i = 1; i <= limit; i++) {

////             System.out.printf("%d     | %d    | %d%n", i, i*i , i*i*i);

//             //padding
            System.out.printf("%-7d     | %-8s    | %d%n", i, i * i, i * i * i);

//                //basic output no formatting
//                System.out.printf( + i +"            |    " + i * i + "           |    "+ i * i * i );

        }
        System.out.println("want cont?  y/n");
        wantsToContinue =scan.next();
    }while (wantsToContinue.equalsIgnoreCase("y"));

////==================================================
//
//        System.out.println("Enter a grade number");
//        double numbr =scan.nextInt();
//
//        System.out.println("=============");
//
//        if (numbr >= 88.9 ){
//            System.out.println("you ent: "+numbr+ " that equals an A");
//        }
//




    } // end of main method- psvm

} // end class brace

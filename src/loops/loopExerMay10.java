package loops;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by user on 5/10/17.
 */
public class loopExerMay10 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // new Scanner obj call it 'scan'

        ////========================
        System.out.println( " The FizzBuzz GAME");
        System.out.println( " print 1-100");

        for( int i=1;  i<=100; i++ ){
            if(i %3 ==0 && i %5 ==0) {
                System.out.println(" FizzBuzz ninja!");
                continue;
            }
            if(i %3 == 0){
                System.out.println("fizz");
                continue;
            }
            if(i %5 == 0){
                System.out.println("buzz");
                continue;
            }
                System.out.println(i);
        }//end for

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
//        System.out.println(" word 2");
////===================================
//        System.out.println("Enter number you'd like to go up to:");
//            long numbr =scan.nextInt();
//        System.out.println("you chose: "+numbr);
//
//        System.out.println("Iteration#=======#square=======#cubed=======");
//        System.out.println();
//
//            for (int i= 0 ; i <=numbr ; i+=2){
//                System.out.println(+ i +"            |    " + i * i + "           |    "+ i * i * i );
//                System.out.println();
//
//    //printf("'%-5d'", 10);
//    //System.out.format("the %s jumped over the %s, %d times", "cow", "moon", 2);
//            }
// //==================================================

//        System.out.println("Enter a grade number");
//        double numbr =scan.nextInt();
//
//
//
//        System.out.println("=============");
//
//        if (numbr >= 88 ){
//            System.out.println("you ent: "+numbr+ " that equals an A");
//        }
//




    } // end of main method- psvm

} // end class brace

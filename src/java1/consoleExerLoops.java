package java1;

import java.util.Random;
import java.util.Scanner;



public class consoleExerLoops {                // this class is file name
public static void main(String[] args){    //  this is psvm main function



        double bBal = 10 ;
        int value = 1;

    Random generator = new Random();
    int die = generator.nextInt(6)+1;
    System.out.println(die);
    System.out.println("+++++++++++");



        while (value  <= 5) {

           System.out.println("While iteration: "+ value + " :" );
            System.out.println( bBal += +5 );
            System.out.println( bBal += -2 );

        value = value +1;

        }  // end While loop -- while( val < y ){  do this ...then increment val by one};

//-----------------------------


        double bBal2 = bBal + .5;         // math calculations
        int bBal3 = (int) bBal - 25;             //cast double to int
        double bBal4 = ((bBal * 3) / 4);

            System.out.println("\n orignal bBal at end of while loop = " + bBal);              // printouts

            System.out.println(" test bBal  " + bBal2);

            System.out.println(" testing: " + (bBal - 25));

            System.out.println("testing: " + ((bBal * 2 )/3) );

//------------------------------
        double interest = (5.0 / 2);    // make the 5 or 2 ..5.0 or 2.0 to get a correctly non truncated anser
        System.out.println("\ndivision with decimal " +interest);

//----------------------------
        boolean isRaining = false;

            if(isRaining) {
                System.out.println("\nWiper ON.");
            }else {
                System.out.println("\nWiper OFF");
            }


    } // end of psvm -public static void main String args

} //end of pub class for consoleExerLoops


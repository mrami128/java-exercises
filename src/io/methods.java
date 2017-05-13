package io;

import java.util.Scanner;

/**
 * Created by user on 5/12/17.
 */

public class methods {

    public static void main(String[] args) {

        // ======== Set Numbers and Set Variables

        Scanner input = new Scanner(System.in);
        double x, y, answer;
        String name;

        //===========Get Name

        System.out.println("enter user name");
        name = input.nextLine();
        sayHello(name);

        //===========
//        System.out.println("enter 1st number between 1 -10\n");
        x = check(input);

//        System.out.println("enter 2nd number between 1-10\n");
        y = check(input);


//================== call functions


//        if (check(x, y)) {
//            System.out.println("number is out of range");
//            main(args);
//        } else {


            doAdd(x, y);

            doSub(x, y);

            System.out.println("\nMultiplication Answer is: " + doMult((int) x, (int) y));

            doDiv(x, y);

            doMod(x, y);
//        }
    }// end main

    // ================ Check x, y
    public static double check(Scanner input) {
        System.out.print("Enter a # between 1 and 10: ");
        double userInput = input.nextDouble();

        if ((userInput >= 1) && (userInput <= 10)) {
            return userInput;
        } else {
            System.out.println("Invalid Number, Try Again!");
            return check(input);
        }
    }

//================== ADD

    public static void doAdd(double x, double y) {
        System.out.println("\nAddition Answer is:" + (x + y));

    }//end doAdd

// ================ Subtract

    public static void doSub(double x, double y) {
        System.out.println("\nSubtraction Answer is:" + (x - y));
    }//end doSub

//================= Multiply

    public static int doMult(int x, int y) {
        if ((x == 0) || (y == 0)) {
            return 0;
        } else if (y == 1) {
            return x;
        } else {
            return x + doMult(x, y - 1);
        }

    }// end of doMult
// ==================== Division

    public static double doDiv(double x, double y) {
        if (y == 0) {
            System.out.println("\nDivision Answer is: Error");
            return 0;
        } else {

            System.out.println("\nDivision Answer is:" + (x / y));
            return x / y;
        }
    }//end doDiv

    public static void doMod(double x, double y) {
        System.out.println("\nModulus Answer is:" + (x % y));
    }//end doDiv

    public static void sayHello(String name) {
        System.out.print("\nHello:" + name + "\n");
    }
//==================
} // end pub class methods


package io;

import java.util.Scanner;


public class random {

    public static void main(String[] args) {  //========The main action area here========

        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number: ");
            int userNum = scan.nextInt();

        System.out.println("-------------------");//uses method defined outside of main-see below
        System.out.println(" random between userNum and userNum + 5:");
            System.out.println(random(userNum,userNum+5));


        System.out.println("---------------------"); //uses method defined outside of main-see below
            System.out.println(" random between 5 and 20");
            System.out.println(random(5,20));


        System.out.println("------------------------");
            double randOne = Math.random();
            System.out.println(" random between 0-1  ----> "+ randOne);


        System.out.println("-------------------------");
            double randTwo =  Math.round(Math.random() *3) +1;
            System.out.println(" random between 1-4 ---> "+randTwo);


        System.out.println("------------------");
            int randFour =  (int)Math.round(Math.random() *3) +1;
            System.out.println(" random between 1-4 w/o dec---> "+randFour);
                                // use explic cast to get .0 decimal rounded off cast into  int vs double

    } // end MAIN

//==================== All the Funstions Are Down here outside of Main============


        public static int random (int min, int max){
            int rand = (int) (Math.round(Math.random() * (max - min)) + min);
        return rand;
        } //end random generator method

} //end  - psvm - public static void main (String[] args)






package java1;

import java.util.Scanner;

/**
 * Created by user on 5/15/17.
 */
public class javaOneReview {

    public static void main(String[] args) {

/*
  *
  * refactor catalog System.out  <---cmd d  takes you to documents?
  *  we can extract variable --it is a refactoring
  *  command b  -then toggle back using-  cntrol tab
   *
   *  also we can Extract method/function
   *    refactoring.com  ---catalog-- Martin Fowler
 */
    long number;
    long factorial;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number");
        number = input.nextLong();


    factorial = 1;

    for(int i=1; i <= number; i++){   //counter
        factorial = factorial * i;  //accumulator

    } //end for

        System.out.println( number + "! = "+ factorial);



    } // end class
}  // end main

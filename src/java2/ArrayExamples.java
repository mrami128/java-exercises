package java2;
import java.util.Scanner;


//------------------------------
public class ArrayExamples {   // PSVM Magic goes here -------


    public static void main(String[] args) {

    boolean [] apples;            //variable  decalar
    apples = new boolean[10];     // var initializ
        System.out.println(apples[4]);

    int [] oranges = new int[20];  // declare and initializ
        // oranges[30] = 7; //this is run-time error in Java..JScript would fill from 21-29 with nulls.

        Scanner input = new Scanner(System.in);
        System.out.println("how many elem should this array have");
        int size = input.nextInt();
        int[] elements =new int[size];

        String[] beatles ={"Joh","Paul"};    // Enumerating array elem..use curly bracks veersus square bracks
        System.out.println(beatles[1]);   //this printout of beatle position 1

//        Products[] products = new Products[10];
//        products [0] = new Products("mango", 2.5)

    } //psvm end
} //public class end

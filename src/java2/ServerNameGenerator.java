package java2;

import java.util.Random;

/**
 * Created by user on 5/18/17.
 */
public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"fast", "sticky", "shiny", "slippy","happy","flappy","crispy", "stinky","rusty","crusty"};

  //--------------------------------------------

        String[] nouns = {"tree", "boot", "tire", "saw", "hammer","shoe","nails", "truck", "bucket", "book"};

 //----------------------------------------------

        Random genNum = new Random();
        System.out.println (adjectives [genNum.nextInt(adjectives.length)] );  // one way using 2 lines or

        System.out.println (nouns [new Random().nextInt(nouns.length)] );  // OR this way with using 1 combined line

        int cycles=0;                                // this generate random number 1-6 can be used to go though cycles repetition
        cycles=( genNum.nextInt(3)+1);
        System.out.println(cycles);

//        // enhanced for loop
//        for (String adjective : adjectives) { //for each adj  in plural adjectives do this stuff
//
//            System.out.println(adjective);
//        } //end for
//
//        // enhanced for loop
//        for (String noun : nouns) { //for each language in languages do
//            System.out.println(noun+ " ");
//        } //end for


    } //end psvm
}//end class
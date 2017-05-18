package java2;

import java.util.Random;

/**
 * Created by user on 5/18/17.
 */
public class ServerNameGenerator {

    public static void main(String[] args) {


  //-------------------------------------------

        String[] adjectives = {"fast", "sticky", "shiny", "slippy","happy","flappy","crispy", "stinky","rusty","crusty"};

  //--------------------------------------------

        String[] nouns = {"tree", "boot", "tire", "saw", "hammer","shoe","nails", "truck", "bucket", "book"};

 //----------------------------------------------
        System.out.println (adjectives [new Random().nextInt(adjectives.length)] );

        System.out.println (nouns [new Random().nextInt(nouns.length)] );


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
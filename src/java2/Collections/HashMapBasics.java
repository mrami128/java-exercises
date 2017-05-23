package java2.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

//-------------------------------------------- HASH MAP Practice----its a collection Object----

  public static void main(String[] args) {

// set up new hash map --> key : value

        Map<Integer, String> map = new HashMap<>();

            map.put(1, "oneMarc" );
            map.put(2, "twoDan" );
            map.put(3, "threeEvan" );
            map.put(4, "fourBen" );

// use map.get to get one item and print it -- using a variable

        String studentText = map.get(1);
        System.out.println(studentText);

// use map.get to get item then print  without assignin it to a variable.

        System.out.println(map.get(1));

 // use map.size

        System.out.println(map.size());

 // to replace one item

        System.out.println(map.get(4));
            System.out.println("-----");
        map.put(4, "fourEmilio");
        System.out.println(map.get(4));
            System.out.println("-------");

 // use Map.Entry VaribleName:   TO  iterate through

        for(Map.Entry keyX : map.entrySet()){
            System.out.println(keyX.getKey() + " " + keyX.getValue());
        }
 // another iterate through version
 //        map.forEach((username, student) -> System.out.println(username + " " + student));

    }//end psvm
}//end class
//-------------------------------------END HASH Practice-----------


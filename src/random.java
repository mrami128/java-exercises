/**
 * Created by user on 5/12/17.
 */
public class random {


    public static void main(String[] args) {

        System.out.println(random(5,20));
        System.out.println(random(5,20));
    }

public static int random (int min, int max){
        int rand = (int) (Math.round(Math.random() * (max - min)) + min);
    return rand;

    }
}





//        double rand =  Math.round(Math.random()*5) +1;

package java2;

public class InputTest {

public static void main (String[] args){

    Input entry = new Input();      // the constructor gets the parameter not need here

    System.out.println("is today wed"); // testin the boolean piece.aiming for true res in console
    System.out.println(entry.yesNo());  //  test boole piece

    int min =1;
    int max =10;

    System.out.println("give num bet 1-10"+min+"  and  "+max);
    System.out.println("the num in range was"+ entry.getInt(1,10));      // checkin the int value being entered within rang?


//---------
    Circle c =new Circle(5);


    } //end psvm String args

} //end class

package java2;

public class AdditionProgram {

    public static void main(String[] args) {         // magic is below-->set up new ob

        Addition addobj1  = new Addition(60.5,20.5);    // creating new obj

        Addition addobj2 = new Addition(20,40);

        //-------------------------------------------

        System.out.println("for addobj1 - the Addition equals = "+ addobj1.getNumber());

        System.out.println("for addobj2 - the Addition equals = " + addobj2.getNumber());
    }

}

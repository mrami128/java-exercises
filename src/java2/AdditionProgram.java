package java2;

public class AdditionProgram {
                                // THE MAGIC HAPPENS BELOW  PSVM
    public static void main(String[] args) {

        Addition addobj1  = new Addition(60.5,20.5);    // creating new obj
        Addition addobj2 = new Addition(20,40);
        //-------------------------------------------
        System.out.println("for addobj1 - the Addition equals = "+ addobj1.getNumber());
        System.out.println("for addobj2 - the Addition equals = " + addobj2.getNumber());

    }  //end psvm
}     // end class addProg





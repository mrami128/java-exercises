package java2;   //  THE OBJECT - BLUEPrint

import java.util.Scanner;

public class Input {

    private Scanner scan;               // this sets variable scanner

    public Input(){
        this.scan = new Scanner(System.in);    // assigning new scanner -- use this so we know its this side using scan
    }

    public String getString(){
        return scan.nextLine();
    }

                /* The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.*/
    public boolean yesNo() {
        String answer = this.getString();    // the class can use it own functions
        if( answer.equalsIgnoreCase("y" ) || answer.equalsIgnoreCase("yes")){
            return true;
                                // this is best way to check for equals regardles of case
        }
        return false;
    }

    //====================

/*  The getInt(int min, int max) method should keep prompting the user for input until they give an integer
 *  within the min and max    */

public int getInt(){
    return scan.nextInt();
}
public int getInt(int min, int max){
    int num = this.getInt();                 //feed in the get int function

     if(num >= min  && num <=max) {         //
         return num;
     }
         System.out.println( "returnNum out of range");
        return getInt(min,max);
}

//-----------------
/*  The getDouble( min, max) method should keep prompting the user for input until they give a double
 *  within the min and max    */


    public double getDouble(){ return scan.nextDouble();
    }
    public double getDouble(double min, double max){
        double num = this.getDouble();                 //feed in the get double function

        if(num>= min  && num <=max) {
            return num;
        }
        System.out.println( "return Num out of range");
        return getDouble(min,max);
    }


} // end of class

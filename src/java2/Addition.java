package java2;


public class Addition {         // this class is called Addition need 2 parts: 1variables(aka state).and 2methods(aka behavior)

    double firstNumber;
    double secondNumber;

    public double  getNumber() {

        return (firstNumber + secondNumber);
    } // end of method

    Addition () {                         // construc MUST have same name Addition as class -file name-

        firstNumber = 10;
        secondNumber = 20;
    }                                   // end of default constructor

    Addition (double L , double B) {

        firstNumber= L;
        secondNumber= B;
    }                                   //end of custom constructor

    }  // end of class








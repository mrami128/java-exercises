package Shapes;


public class Rectangle extends Quadralateral implements Measurable{      // this OBJ class is called Addition need 2 parts:variables & methods

    public Rectangle(double length, double width) {                     // this constructor accepts values.bottom of chute

    super(length,width) ;           // when a class has parent Quad in this case
                                    //you must first call parent constructor--super(length,width) in this case
    }


//----------------------------------
//    private double length;           // 2 properties /variables  == state of object
//    private double width;
//
//// beca of private above--the constructor below is like baby function for the main retangle
//
//    public Rectangle(double length, double width) {   // this constructor accepts values.bottom of chute
//
//        this.length = length;
//        this.width = width;
//    }
//
//// -----------------------------2 baby functions -getters- of the constructor for the main class retangle
//
//    public double getArea() {
//        return length * width;
//    }
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }


}  //------------------------ END of rectangle class




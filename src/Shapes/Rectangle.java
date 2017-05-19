package Shapes;


public class Rectangle extends Quadralateral implements Measurable{           // this OBJ class is called Addition need 2 parts:variables & methods

    public Rectangle(double length, double width) {   // this constructor accepts values.bottom of chute

    super(length,width) ;

    }


//----------------------------------
//    private double length;           // 2 properties /variables  == state of object
//    private double width;
//
//// this constructor is like baby function for the main retangle
//
//    public Rectangle(double length, double width) {   // this constructor accepts values.bottom of chute
//
//        this.length = length;
//        this.width = width;
//    }
//
//// -----------------------------2 baby functions of the constructor for the main class retangle
//
//    public double getArea() {
//        return length * width;
//    }
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }


}  //------------------------ END of rectangle class




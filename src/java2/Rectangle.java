package java2;

                                // this is OBJECT- Class - blueprint

public class Rectangle {           // this OBJ class is called Addition need 2 parts:variables & methods

    private double length;           // 2 properties /variables  == state of object
    private double width;

// this constructor is like baby function for the main retangle

    public Rectangle(double length, double width) {   //constructor accepts values

        this.length = length;
        this.width = width;
    }

// 2 baby functions of the constructor for the main class retangle

    public double getArea() {
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

}//end rectangle class




package Shapes;

abstract class Quadralateral extends Shape implements Measurable {

    protected double length;               // 2 properties /variables  == state of object
    protected double width;
                                                // this constructor is like baby function for the main retangle
// start constructor

    public Quadralateral (double length, double width) {   //this constructor accepts values

        this.length = length;
        this.width = width;

    } // -------------end constructor

    // 2 baby functions related to the constructor shown above

    public double getArea() {
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

} //end Quad

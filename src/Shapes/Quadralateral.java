package Shapes;

abstract class Quadralateral extends Shape implements Measurable {    // cannot instantiate abs classes or interfaces--bec theyre incomplete
                                                                        // bec theyre incomplete by design
    protected double length;                                            // 2 properties /variables  == state of object
    protected double width;


// start constructor .. this constructor is like baby function for the main retangle

    public Quadralateral (double length, double width) {   //this constructor accepts values

        this.length = length;
        this.width = width;

    } // -------------end constructor

                    // 2 baby methods  related to the constructor shown above
                    // these 2 are the getters.

        public double getArea() {
        return length * width;
    }

        public double getPerimeter(){
        return 2 * length + 2 * width;
    }


    // need 2 more baby meths..to place setters  here ..step 4



} //end main class Quad

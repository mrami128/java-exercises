package Shapes;

/**
 * Created by user on 5/19/17.
 */
public class ShapesTest {                           //create new class Shapes Test for testing to work with rec and square
    public static void main(String[] args) {            // need psvm

        Measurable myShape;                            // Variable

        myShape = new Rectangle(4.0,2.0);    //create variable type rectangle
            System.out.println("Area of Rect: " + myShape.getArea());
            System.out.println("Perimeter Rect: " + myShape.getPerimeter());

        myShape = new Square (2,4);
            System.out.println("Area of Squ: " + myShape.getArea());
            System.out.println("Perimeter of Squ: " + myShape.getPerimeter());

        // // ------------------------------------

 // // PUT Step through RED DOT here----->
 // // Method for new instances of new Rect new squar -getting value length and width

//          System.out.println("box1 perimeter: " + box1.getPerimeter() );
//          System.out.println("box1 area: " + box1.getArea() );
//
//        Rectangle box2 = new Square(5);    // now create new Square box2 --> bec square is child of rectangle
//          System.out.println("box2 perim : "+ box2.getPerimeter());
//          System.out.println("box2 area : "+ box2.getArea());


    }//end main
} // end

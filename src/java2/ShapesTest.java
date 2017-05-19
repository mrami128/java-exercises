package java2;

/**
 * Created by user on 5/19/17.
 */
public class ShapesTest {                           //create new class
    public static void main(String[] args) {            // need psvm


 // PUT Step through here----->

        Rectangle box1 = new Rectangle(5,4);      //create vari type rectangle
          System.out.println("box1 perimeter: " + box1.getPerimeter() + " and Area is: "+ box1.getArea());  // test it by sout
          System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);    // now create new rectangle box2 --> bec square is child of rectangle
          System.out.println("box2 perim : "+ box2.getPerimeter());
          System.out.println("box2 area : "+ box2.getArea());


    }//end main
} // end

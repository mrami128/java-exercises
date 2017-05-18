package java2;

/**
 * Created by user on 5/17/17.
 */
public class CircleApp {

    public static void main(String[] args) {

        Input entry = new Input();              // input class  can be used for mutilple

        System.out.println("Give me the radius");
        double radius = entry.getDouble();

        Circle c =new Circle(radius);

        System.out.println("Area " + c.getArea());
        System.out.println("Circ. "+ c.getCircumference());
    }


}


import java.io.*;
public class Circle extends Shape  {

    public static String color = "White";

    public String getName() {
        return "Circle";
    }

    public void calculateArea() {
        System.out.println("Circle's area is radius^2 * π");
    }

    public void calculatePerimeter() {
        System.out.println("Circle's perimeter is 2 * π * radius");
    }

}


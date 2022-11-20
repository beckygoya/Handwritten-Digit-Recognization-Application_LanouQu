public class Triangle extends Shape {

    public static String color = "Pink";

    public String getName() {
        return "Triangle";
    }

    public void calculateArea() {
        System.out.println("Triangle's area is base*height/2");
    }

    public void calculatePerimeter() {
        System.out.println("Triangle's perimeter is sideA + sideB + sideC");
    }
}

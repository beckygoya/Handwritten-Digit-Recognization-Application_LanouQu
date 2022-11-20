public class Rectangle extends Shape {
    public static String color = "Red";

    public String getName() {
        return "Rectangle";
    }

    public void calculateArea() {
        System.out.println("Rectangle's area is length * width");
    }

    public void calculatePerimeter() {
        System.out.println("Rectangle's perimeter is (length + width) * 2 ");
    }

}

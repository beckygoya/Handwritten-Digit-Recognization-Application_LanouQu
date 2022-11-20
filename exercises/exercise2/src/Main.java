public class Main {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();
        Shape mySquare = new Square();
        Shape myTriangle = new Triangle();
        myCircle.calculateArea();
        myCircle.calculatePerimeter();
        myRectangle.calculateArea();
        myRectangle.calculatePerimeter();
        mySquare.calculateArea();
        mySquare.calculatePerimeter();
        myTriangle.calculateArea();
        myTriangle.calculatePerimeter();
        System.out.println("Circle is " + Circle.color);
        System.out.println("Rectangle is " + Rectangle.color);
        System.out.println("Square is " + Square.color);
        System.out.println("Triangle is " + Triangle.color);
    }
}

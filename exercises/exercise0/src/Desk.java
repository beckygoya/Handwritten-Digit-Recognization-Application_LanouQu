public class Desk {
    int length;
    int width;
    int height;
    int price;
    String name;
    String color;
    String material;
    String shape;

    public Desk(String name, String color, String material) {
        this.name = name;
        this.color = color;
        this.material = material;

        System.out.printf("Constructing instance of Desk,%s,%s,and name is %s.%n", this.material, this.color, this.name);
    }

    public void getHeight() {
        System.out.println("20 inches");
    }

    public void getWidth() {
        System.out.println("30 inches");
    }

    public void getShape() {
        System.out.println("Rectangular");
    }
}

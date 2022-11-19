public class Refrigerator {
    int length;
    int width;
    int height;
    int capacity;
    int price;
    String name;
    String color;
    Boolean isOpen;

    public Refrigerator(String name, String color, int capacity) {
        this.name = name;
        this.color = color;
        this.capacity = capacity;

        System.out.printf("Constructing instance of Refrigerator,%s,%d, and name is %s,%n", this.color, this.capacity,this.name);

    }

    public void openRefrigerator() {
        System.out.println("Refrigerator is Open");
    }

    public void closeRefrigerator() {
        System.out.println("Refrigerator is Closed");
    }

    public void changeColor() {
        System.out.println("Color is Grey");

    }
}

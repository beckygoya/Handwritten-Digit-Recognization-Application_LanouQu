public class Door {
    int length;
    int width;
    int price;
    String color;
    String name;
    String material;
    String handle;
    Boolean isOpen;


    public Door(String material, String name, String color) {
        this.color = color;
        this.name = name;
        this.material = material;

        System.out.printf("Constructing instance of Door，%s,%s, and name is %s.%n", this.color, this.material, this.name);
    }

    public void openDoor() {
        System.out.println("Door Open");
    }

    public void closeDoor() {
        System.out.println("Door Closed");
    }

    public void changeColor() {
        System.out.println("Color Is White");
    }
}
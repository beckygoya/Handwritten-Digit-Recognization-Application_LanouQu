public class Computer {
    int price;
    int length;
    int width;
    String color;
    String name;
    String storage;
    String GPU;
    Boolean isOpen;

    public Computer(String name, String storage, String color) {
        this.name = name;
        this.storage = storage;
        this.color = color;
        System.out.printf("Constructing instance of Computer,%s,%s,and name is %s.%n", this.color, this.storage, this.name);
    }

    public void start() {
        System.out.println("Computer Start");
    }

    public void shutDown() {
        System.out.println("Computer Shut Down");
    }

    public void reboot() {
        System.out.println("Computer Reboot");
    }
}

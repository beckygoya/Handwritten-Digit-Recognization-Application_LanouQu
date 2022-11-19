public class Television {
    int length;
    int width;
    int price;
    String name;
    String color;
    String resolution;
    String refreshRate;
    Boolean isOpen;

    public Television(String name, String color, String resolution) {
        this.name = name;
        this.color = color;
        this.resolution = resolution;

        System.out.printf("Constructing instance of Television,%s,%s, and name is %s.%n", this.color, this.resolution,this.name);
    }


    public void openTV() {
        System.out.println("TV is Open");
    }

    void shutDownTV() {
        System.out.println("TV is Shut Down");
    }

    void rebootTV() {
        System.out.println("TV Reboot");
    }
}

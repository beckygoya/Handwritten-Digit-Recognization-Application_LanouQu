public class Cellphone {
    int length;
    int width;
    int price;
    String name;
    String color;
    String storage;
    String model;
    Boolean isOpen;

    public Cellphone(String name, String color, String storage) {
        this.name = name;
        this.color = color;
        this.storage = storage;

        System.out.printf("Constructing instance of Cellphone, %s,%s, and name is %s.%n", this.storage, this.color, this.name);
    }


    public void openCellphone() {
        System.out.println("Cellphone Open");
    }

    public void shutDownCellphone() {
        System.out.println("Cellphone Shut Down");
    }

    public void rebootCellphone() {
        System.out.println("Cellphone Reboot");
    }
}

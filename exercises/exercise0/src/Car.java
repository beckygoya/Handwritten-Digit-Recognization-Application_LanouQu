public class Car {
    int length;
    int width;
    int height;
    int price;
    String name;
    String color;
    String carModel;
    Boolean isParked;

    public Car(String name, String color, String carModel) {
        this.name = name;
        this.color = color;
        this.carModel = carModel;

        System.out.printf("Constructing instance of Car, %s %s and name is %s.%n", this.color, this.carModel, this.name);
    }


    public void startCar() {
        System.out.println("Start Car");
    }

    public void parkCar() {
        System.out.println("Park Car");
    }

    public void lockCar() {
        System.out.println("Lock Car");
    }
}

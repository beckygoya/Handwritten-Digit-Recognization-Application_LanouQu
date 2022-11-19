public class LivingRoom {
    class Sofa {
        int length;
        int width;
        int weight;
        int height;
        int price;
        String color;
        String material;
        String name;

        public Sofa(String material, String name, String color) {
            this.color = color;
            this.name = name;
            this.material = material;

            System.out.printf("Constructing instance of Sofa，%s,%s,%s.%n", this.color, this.name, this.material);
        }

        public void getLength() {
            System.out.println("5 inches");
        }

        public void getWidth() {
            System.out.println("2 inches");
        }

        public void getHeight() {
            System.out.println("0.5 meters");
        }

    }

    class Table {
        int length;
        int width;
        int weight;
        int price;
        String color;
        String brand;
        String material;
        String shape;

        public Table(String material, String brand, String color) {
            this.color = color;
            this.brand = brand;
            this.material = material;

            System.out.printf("Constructing instance of Table，%s,%s,%s.%n", this.color, this.brand, this.material);
        }

        public void getLength() {
            System.out.println("30 inches");
        }

        public void getWidth() {
            System.out.println("20 inches");
        }

        public void getHeight() {
            System.out.println("2 meters");
        }
    }

    int length;
    int width;
    int height;
    int square;
    String name;
    Boolean isHeaterOn;
    Boolean isLightsOn;
    Boolean isOccupied;

    public LivingRoom(int length, int width, String name) {
        this.length = length;
        this.width = width;
        this.name = name;

        System.out.printf("Constructing instance of LivingRoom,%d,%d,and name is %s.%n", this.length, this.width, this.name);
    }

    public void getLength() {
        System.out.println("30 inches");
    }

    public void getWidth() {
        System.out.println("20 inches");
    }

    public void getHeight() {
        System.out.println("20 inches");
    }
}
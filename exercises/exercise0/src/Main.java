public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car("Tesla", "White", "Model3");
        Car myCar2 = new Car("Ford", "Red", "F-150");
        Car myCar3 = new Car("Honda", "Grey", "Accord");

        Book myBook1 = new Book("Harry Potter", "J.K. Rowling", "Adventure");
        Book myBook2 = new Book("Snow White and the Seven Dwarfs", "Brothers Grimm", "Fairy Tale");
        Book myBook3 = new Book("Sleeping Beauty", "Brothers Grimm", "Fairy Tale");

        Cellphone myCellphone1 = new Cellphone("Apple", "White", "256G");
        Cellphone myCellphone2 = new Cellphone("Google", "Grey", "256G");
        Cellphone myCellphone3 = new Cellphone("Huawei", "Black", "512G");

        Computer myComputer1 = new Computer("Apple", "512G", "Grey");
        Computer myComputer2 = new Computer("Acer", "128G", "White");
        Computer myComputer3 = new Computer("Lenovo", "256G", "Black");

        Desk myDesk1 = new Desk("Desk1", "White", "Wooden");
        Desk myDesk2 = new Desk("Desk2", "Yellow", "Wooden");
        Desk myDesk3 = new Desk("Desk3", "Black", "Wooden");

        Door myDoor1 = new Door("Wooden", "Door1", "Yellow");
        Door myDoor2 = new Door("Wooden", "Door2", "Black");
        Door myDoor3 = new Door("Wooden", "Door3", "White");

        LivingRoom myLivingRoom1 = new LivingRoom(30, 20, "MainLivingRoom1");
        LivingRoom myLivingRoom2 = new LivingRoom(50, 25, "MainLivingRoom2");
        LivingRoom myLivingRoom3 = new LivingRoom(45, 30, "MainLivingRoom3");

        House myHouse1 = new House("House1", "Santa Clara", "USA");
        House myHouse2 = new House("House2", "Santa Clara", "USA");
        House myHouse3 = new House("House3", "Dallas", "USA");

        Refrigerator myRefrigerator1 = new Refrigerator("Refrigerator1", "White", 17);
        Refrigerator myRefrigerator2 = new Refrigerator("Refrigerator2", "Red", 28);
        Refrigerator myRefrigerator3 = new Refrigerator("Refrigerator3", "Grey", 25);

        Television myTelevision1 = new Television("Television1", "Black", "720p");
        Television myTelevision2 = new Television("Television2", "Black", "1080p");
        Television myTelevision3 = new Television("Television3", "Grey", "720p");
    }
}

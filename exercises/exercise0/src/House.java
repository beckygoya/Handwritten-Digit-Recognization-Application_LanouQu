public class House {

    int price;
    int zipcode;
    int square;
    String name;
    String address;
    String city;
    String county;
    String country;

    public House(String name, String county, String country) {
        this.name = name;
        this.county = county;
        this.country = country;

        System.out.printf("Constructing instance of House,%s,%s,and name is %s.%n", this.county, this.country,this.name);
    }

    public void buy() {
        System.out.println("Buy a house");
    }

    public void sell() {
        System.out.println("Sell a house");
    }

    public void build() {
        System.out.println("Build a house");
    }
}

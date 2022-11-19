public class Book {
    int length;
    int width;
    int price;
    int pages;
    String name;
    String author;
    String color;
    String category;

    public Book(String name, String author, String category) {
        this.name = name;
        this.author = author;
        this.category = category;

        System.out.printf("Constructing instance of Book %s,%s,and name is %s.%n", this.author, this.category, this.name);
    }

    public String getName() {
        return this.name;
    }

    public void getPrice() {
        System.out.println("The price is $10");
    }

    public void getAuthor() {
        System.out.println("The author is J.K. Rowling");
    }
}

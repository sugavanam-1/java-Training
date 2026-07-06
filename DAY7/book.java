public class Book {

    String title = "Java Programming";
    String author = "James";
    double price = 650;

    void display() {

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);

    }

    public static void main(String[] args) {

        Book b = new Book();
        b.display();

    }
}
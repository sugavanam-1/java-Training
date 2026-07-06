public class Product {

    int id = 101;
    String name = "Mouse";
    double price = 599;

    void display() {

        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Price : " + price);

    }

    public static void main(String[] args) {

        Product p = new Product();
        p.display();

    }
}
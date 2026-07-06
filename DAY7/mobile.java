public class Mobile {

    String brand = "Samsung";
    String model = "Galaxy S25";
    double price = 85000;

    void display() {

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);

    }

    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.display();

    }
}
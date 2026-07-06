public class Car {

    String brand = "Toyota";
    String model = "Innova";
    int year = 2025;

    void display() {

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);

    }

    public static void main(String[] args) {

        Car c = new Car();
        c.display();

    }
}
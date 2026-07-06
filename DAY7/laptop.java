public class Laptop {

    String brand = "Dell";
    int ram = 16;
    int storage = 512;

    void display() {

        System.out.println("Brand : " + brand);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");

    }

    public static void main(String[] args) {

        Laptop l = new Laptop();
        l.display();

    }
}
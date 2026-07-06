public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(String name) {
        System.out.println("Name : " + name);
    }

    ConstructorOverloading(int age) {
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        new ConstructorOverloading();

        new ConstructorOverloading("Arun");

        new ConstructorOverloading(20);

    }
}
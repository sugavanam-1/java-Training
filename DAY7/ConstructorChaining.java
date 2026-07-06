public class ConstructorChaining {

    ConstructorChaining() {
        this(100);
        System.out.println("Default Constructor");
    }

    ConstructorChaining(int a) {
        System.out.println("Value = " + a);
    }

    public static void main(String[] args) {

        new ConstructorChaining();

    }
}
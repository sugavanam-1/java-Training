public class ParameterizedConstructor {

    int id;
    String name;

    ParameterizedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor s =
                new ParameterizedConstructor(101, "Ravi");

        s.display();
    }
}
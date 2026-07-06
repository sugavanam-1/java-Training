public class CopyConstructor {

    int id;
    String name;

    CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    CopyConstructor(CopyConstructor s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        CopyConstructor s1 =
                new CopyConstructor(101, "Ravi");

        CopyConstructor s2 =
                new CopyConstructor(s1);

        s1.display();
        s2.display();

    }
}
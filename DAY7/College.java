public class College {

    String name = "NIET";
    String location = "Coimbatore";

    void display() {

        System.out.println("College : " + name);
        System.out.println("Location : " + location);

    }

    public static void main(String[] args) {

        College c = new College();
        c.display();

    }
}
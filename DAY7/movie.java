public class Movie {

    String title = "Leo";
    String hero = "Vijay";
    double rating = 8.5;

    void display() {

        System.out.println("Movie : " + title);
        System.out.println("Hero : " + hero);
        System.out.println("Rating : " + rating);

    }

    public static void main(String[] args) {

        Movie m = new Movie();
        m.display();

    }
}
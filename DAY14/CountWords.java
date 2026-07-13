import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Number of Words = 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Number of Words = " + words.length);
        }
    }
}
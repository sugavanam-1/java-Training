import java.util.Scanner;

public class SmallestWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String smallest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }

        System.out.println("Smallest Word = " + smallest);
    }
}
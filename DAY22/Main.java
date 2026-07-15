import java.util.Scanner;

public class Main {

    public static char findTheDifference(String s, String t) {
        long sum = 0, diff = 0;

        for (char c : t.toCharArray()) {
            sum += c - 'a';
        }

        for (char c : s.toCharArray()) {
            diff += c - 'a';
        }

        return (char) (sum - diff + 'a');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string (s): ");
        String s = sc.nextLine();

        System.out.print("Enter second string (t): ");
        String t = sc.nextLine();

        // Find and display the extra character
        char result = findTheDifference(s, t);
        System.out.println("The extra character is: " + result);

        sc.close();
    }
}
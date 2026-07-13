import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = str.toLowerCase();

        System.out.println("Lowercase = " + result);
    }
}
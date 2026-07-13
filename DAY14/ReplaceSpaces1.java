import java.util.Scanner;

public class ReplaceSpaces1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = str.replace(" ", "-");

        System.out.println("Result = " + result);
    }
}
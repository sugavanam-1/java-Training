import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("After Removing Duplicates = " + result);
    }
}
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int letters = 0, digits = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch))
                letters++;
            else if (Character.isDigit(ch))
                digits++;
            else
                special++;
        }

        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }
}
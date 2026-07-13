import java.util.Scanner;

public class OnlyDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        boolean digits = true;

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))) {
                digits = false;
                break;
            }
        }

        if (digits)
            System.out.println("String contains only digits");
        else
            System.out.println("String does not contain only digits");
    }
}
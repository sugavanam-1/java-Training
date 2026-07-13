import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are Not Equal");
            return;
        }

        boolean same = true;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                same = false;
                break;
            }
        }

        if (same)
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");
    }
}
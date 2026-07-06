 import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input: ");
        String input = sc.nextLine();

        if (input.equals("s")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
    }

}
import java.util.Scanner;

public class ProductDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;

        while (num != 0) {
            product *= num % 10;
            num /= 10;
        }

        System.out.println("Product = " + product);
    }
}
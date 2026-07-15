import java.util.Scanner;

public class Main12 {

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (char j : jewels.toCharArray()) {
            for (char s : stones.toCharArray()) {
                if (j == s) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter jewels: ");
        String jewels = sc.nextLine();

        System.out.print("Enter stones: ");
        String stones = sc.nextLine();

        // Output
        int result = numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result);

        sc.close();
    }
}
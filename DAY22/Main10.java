import java.util.Scanner;

public class Main10 {

    public static int largestAltitude(int[] gain) {

        int n = gain.length;
        int mx = 0;

        for (int i = 0; i <= n; i++) {

            int alt = 0;

            for (int j = 0; j < i; j++) {
                alt += gain[j];
            }

            mx = Math.max(mx, alt);
        }

        return mx;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of gain array: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);

        sc.close();
    }
}
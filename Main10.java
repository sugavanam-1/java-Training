import java.util.*;

public class Main10 {

    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = 0;
        int sum = 0;

        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }

        int l = max;
        int h = sum;
        int ans = sum;

        while (l <= h) {
            int capacity = l + (h - l) / 2;
            int totalDays = 1;
            int cur = capacity;

            for (int i = 0; i < n; i++) {
                if (cur < weights[i]) {
                    totalDays++;
                    cur = capacity;
                }
                cur -= weights[i];
            }

            if (totalDays <= days) {
                ans = capacity;
                h = capacity - 1;
            } else {
                l = capacity + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        int days = sc.nextInt();

        System.out.println(shipWithinDays(weights, days));

        sc.close();
    }
}
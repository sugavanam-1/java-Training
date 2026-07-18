package Day24;
import java.util.*;

public class Main4 {

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, h, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canFinish(int[] piles, int h, int k) {
        long hours = 0;

        for (int pile : piles) {
            hours += pile / k;
            if (pile % k != 0) {
                hours++;
            }
        }

        return hours <= h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        int h = sc.nextInt();

        System.out.println(minEatingSpeed(piles, h));

        sc.close();
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main8 {

    public static boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            sum %= k;

            // If sum is divisible by k and subarray length >= 2
            if (sum == 0 && i > 0) {
                return true;
            }

            // Same remainder found before and distance > 1
            if (map.containsKey(sum) && i - map.get(sum) > 1) {
                return true;
            }

            // Store first occurrence of remainder
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        boolean result = checkSubarraySum(nums, k);

        System.out.println("Result: " + result);

        sc.close();
    }
}
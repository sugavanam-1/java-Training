import java.util.*;

public class Main8 {

    public static int findMin(int[] nums) {
        int n = nums.length;

        if (nums[0] <= nums[n - 1] || n == 1) {
            return nums[0];
        }

        if (n == 2) {
            return (nums[0] >= nums[1]) ? nums[1] : nums[0];
        }

        int min = nums[0];
        int r = 3;

        if (n < 6) {
            r = 1;
        }

        for (int i = r - 1; i < n; i = i + r) {

            if (nums[i] < min) {

                if (i - (r - 1) >= 0 && i - (r - 1) < n &&
                        nums[i - (r - 1)] < nums[i]) {
                    return nums[i - (r - 1)];
                } else if (i - (r - 2) >= 0 && i - (r - 2) < n &&
                        nums[i - (r - 2)] < nums[i]) {
                    return nums[i - (r - 2)];
                } else {
                    return nums[i];
                }
            }
        }

        if (nums[n - (r - 1)] < min) {
            return nums[n - (r - 1)];
        } else if (nums[n - (r - 2)] < min) {
            return nums[n - (r - 2)];
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter array size
        int n = sc.nextInt();

        // Enter array elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Print the minimum element
        System.out.println(findMin(nums));

        sc.close();
    }
}
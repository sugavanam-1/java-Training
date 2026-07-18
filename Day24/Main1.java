package Day24;
import java.util.*;

public class Main1 {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
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

        // Enter target value
        int target = sc.nextInt();

        // Print result
        System.out.println(searchInsert(nums, target));

        sc.close();
    }
}
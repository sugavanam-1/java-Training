import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main9 {

    public static int findMaxLength(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();

        int sum = 0;
        int subArrayLength = 0;

        for (int i = 0; i < n; i++) {

            // Replace 0 with -1 and 1 with +1
            sum += (nums[i] == 0) ? -1 : 1;

            // If sum becomes 0, subarray from 0 to i has equal 0s and 1s
            if (sum == 0) {
                subArrayLength = i + 1;
            }
            // If same sum seen before, update maximum length
            else if (mp.containsKey(sum)) {
                subArrayLength = Math.max(subArrayLength, i - mp.get(sum));
            }
            // Store first occurrence of sum
            else {
                mp.put(sum, i);
            }
        }

        return subArrayLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMaxLength(nums);

        System.out.println("Maximum Length of Contiguous Subarray: " + result);

        sc.close();
    }
}
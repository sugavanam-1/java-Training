import java.util.*;

public class Main1 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find next greater element for every number in nums2
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Remaining elements have no next greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build the answer for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter size of nums1
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        // Enter elements of nums1
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Enter size of nums2
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        // Enter elements of nums2
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Get result
        int[] result = nextGreaterElement(nums1, nums2);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
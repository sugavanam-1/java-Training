import java.util.*;

public class Main7 {

    public static int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;

        // Store frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Bucket array
        List<Integer>[] bucket = new ArrayList[n + 1];

        // Place numbers into buckets based on frequency
        for (int key : map.keySet()) {

            int freq = map.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        int[] ans = new int[k];
        int index = 0;

        // Traverse buckets from highest frequency to lowest
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    ans[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return ans;
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = topKFrequent(nums, k);

        System.out.println("Top " + k + " Frequent Elements:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
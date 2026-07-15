import java.util.HashMap;

public class SubarrraySum {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> subNum = new HashMap<>();

        subNum.put(0, 1);

        int total = 0;
        int count = 0;

        for (int n : nums) {
            total += n;

            if (subNum.containsKey(total - k)) {
                count += subNum.get(total - k);
            }

            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays: " + result);
    }
}
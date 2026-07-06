public class PivotIndex {
    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};

        int total = 0;

        for (int x : nums)
            total += x;

        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            if (left == total - left - nums[i]) {
                System.out.println(i);
                return;
            }

            left += nums[i];
        }

        System.out.println(-1);
    }
}
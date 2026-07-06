public class ShuffleArray {
    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};

        int n = 3;

        int[] ans = new int[nums.length];

        int j = 0;

        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + n];
        }

        for (int x : ans)
            System.out.print(x + " ");
    }
}
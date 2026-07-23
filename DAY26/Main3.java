import java.util.*;

public class Main3 {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    public static void backtrack(int[] nums, List<Integer> temp,
                                 boolean[] used, List<List<Integer>> result) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            used[i] = true;
            temp.add(nums[i]);

            backtrack(nums, temp, used, result);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
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

        // Generate permutations
        List<List<Integer>> result = permute(nums);

        // Print permutations
        for (List<Integer> list : result) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
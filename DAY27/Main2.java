import java.util.*;

public class Main2 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] nums, int start,
                                 List<Integer> temp,
                                 List<List<Integer>> result) {

        result.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);

            backtrack(nums, i + 1, temp, result);

            temp.remove(temp.size() - 1);
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

        // Generate all subsets
        List<List<Integer>> result = subsets(nums);

        // Print subsets
        for (List<Integer> subset : result) {
            System.out.print("[");
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i));
                if (i != subset.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        sc.close();
    }
}
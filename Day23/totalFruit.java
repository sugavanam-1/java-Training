import java.util.HashMap;
import java.util.Map;

public class totalFruit {

    public static int totalFruit(int[] fruits) {

        int start = 0, end = 0;
        int n = fruits.length;
        int maxLen = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while (end < n) {

            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);

            while (map.size() >= 3) {
                map.put(fruits[start], map.get(fruits[start]) - 1);

                if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }

                start++;
            }

            int currLen = end - start + 1;
            maxLen = Math.max(maxLen, currLen);

            end++;
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 1};

        int result = totalFruit(fruits);

        System.out.println("Maximum Fruits Collected = " + result);
    }
}
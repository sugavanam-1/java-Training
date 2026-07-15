import java.util.HashMap;

public class maxPoints {

    public static int maxPoints(int[][] arr) {

        int max = 1;

        for (int i = 0; i < arr.length; i++) {

            HashMap<Double, Integer> map = new HashMap<>();

            for (int j = 0; j < arr.length; j++) {

                if (i == j)
                    continue;

                double slope;

                if (arr[j][0] - arr[i][0] != 0) {
                    slope = (arr[j][1] - arr[i][1]) * 1.0
                            / (arr[j][0] - arr[i][0]);
                } else {
                    slope = Integer.MAX_VALUE;
                }

                map.put(slope, map.getOrDefault(slope, 1) + 1);

                max = Math.max(max, map.get(slope));
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] points = {
                {1, 1},
                {2, 2},
                {3, 3}
        };

        int result = maxPoints(points);

        System.out.println("Maximum Points on a Line = " + result);
    }
}
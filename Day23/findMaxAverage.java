public class findMaxAverage {

    public static double findMaxAverage(int[] arr, int k) {
        int i = 0, j = k - 1;
        double ans = -Double.MAX_VALUE;
        int sum = 0, n = arr.length;

        // Calculate the sum of the first window
        for (int x = 0; x <= j; x++) {
            sum += arr[x];
        }

        while (j < n) {
            double avg = (double) sum / k;
            ans = Math.max(ans, avg);

            i++;
            j++;

            if (j < n) {
                sum += arr[j];
            }

            sum -= arr[i - 1];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(arr, k);

        System.out.println("Maximum Average = " + result);
    }
}
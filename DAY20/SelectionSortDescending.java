import java.util.*;

public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
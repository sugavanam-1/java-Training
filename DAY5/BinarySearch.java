import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int key = sc.nextInt();

        int index = Arrays.binarySearch(arr, key);

        if (index >= 0)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
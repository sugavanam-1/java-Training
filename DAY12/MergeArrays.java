import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter first array elements:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter second array elements:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merge = new int[n1 + n2];

        for(int i = 0; i < n1; i++) {
            merge[i] = arr1[i];
        }

        for(int i = 0; i < n2; i++) {
            merge[n1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");

        for(int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
import java.util.Scanner;

public class Main11 {

    public static int[] vowelStrings(String[] words, int[][] arr) {

        int[] ans = new int[arr.length];
        boolean[] isFound = new boolean[words.length];

        // Check whether each word starts and ends with a vowel
        for (int i = 0; i < words.length; i++) {
            isFound[i] = containsVowels(words[i]);
        }

        // Prefix sum array
        int[] values = new int[isFound.length];
        int count = 0;

        for (int i = 0; i < isFound.length; i++) {
            if (isFound[i]) {
                count++;
            }
            values[i] = count;
        }

        // Process each query
        for (int i = 0; i < arr.length; i++) {

            if (arr[i][0] == arr[i][1]) {
                if (isFound[arr[i][0]]) {
                    ans[i] = 1;
                } else {
                    ans[i] = 0;
                }
                continue;
            }

            ans[i] = values[arr[i][1]] - values[arr[i][0]]
                    + (isFound[arr[i][0]] ? 1 : 0);
        }

        return ans;
    }

    // Check if a word starts and ends with a vowel
    private static boolean containsVowels(String s) {

        int l = s.length() - 1;

        return (isVowel(s.charAt(0)) && isVowel(s.charAt(l)));
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input words
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Input queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        int[][] queries = new int[q][2];

        System.out.println("Enter queries (start end):");
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        int[] result = vowelStrings(words, queries);

        System.out.println("Results:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
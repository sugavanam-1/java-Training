import java.util.Scanner;

public class Main5 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] alphabetsCounter = new int[26];

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            alphabetsCounter[c - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (alphabetsCounter[c - 'a'] == 0) {
                return false;
            }
            alphabetsCounter[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine: ");
        String magazine = sc.nextLine();

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println("Result: " + result);

        sc.close();
    }
}
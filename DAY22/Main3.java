import java.util.HashMap;
import java.util.Scanner;

public class Main3 {

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();

        String[] arr = s.trim().split("\\s+");

        if (pattern.length() != arr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (hm.containsKey(ch)) {
                if (!hm.get(ch).equals(arr[i])) {
                    return false;
                }
            } else {
                if (hm.containsValue(arr[i])) {
                    return false;
                }

                hm.put(ch, arr[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        boolean result = wordPattern(pattern, s);

        System.out.println(result);

        sc.close();
    }
}
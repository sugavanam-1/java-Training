import java.util.Scanner;

public class Main4 {

    public static boolean isIsomorphic(String s, String t) {

        int[] map1 = new int[200];
        int[] map2 = new int[200];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }

            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isIsomorphic(s, t);

        System.out.println("Result: " + result);

        sc.close();
    }
}
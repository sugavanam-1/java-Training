import java.util.Arrays;

public class checkInclusion {

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int left = 0;

        int[] counter1 = new int[26];
        int[] counter2 = new int[26];

       
        for (char ch : s1.toCharArray()) {
            counter1[ch - 'a']++;
        }

       
        for (int right = 0; right < s2.length(); right++) {

            counter2[s2.charAt(right) - 'a']++;

          
            while (right - left + 1 > s1.length()) {
                counter2[s2.charAt(left) - 'a']--;
                left++;
            }

         
            if (Arrays.equals(counter1, counter2)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean result = checkInclusion(s1, s2);

        System.out.println(result);
    }
}
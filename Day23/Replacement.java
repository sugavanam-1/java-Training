public class Replacement {

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26]; // Frequency of A-Z

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            
            freq[s.charAt(right) - 'A']++;

            
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

           
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "ABAB";
        int k = 2;

        int result = characterReplacement(s, k);

        System.out.println("Longest Length = " + result);
    }
}
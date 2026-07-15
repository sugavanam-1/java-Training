public class MaxVowels{

    static class Solution {

        public int maxVowels(String s, int k) {
            int c = 0;
            int maxc = Integer.MIN_VALUE;

            for (int i = 0; i < k; i++) {
                if (checkv(s.charAt(i)))
                    c++;
            }

            maxc = c;
            int l = 0;
            int r = k - 1;

            while (r < s.length()) {
                if (checkv(s.charAt(l)))
                    c--;

                l++;
                r++;

                if (r < s.length()) {
                    if (checkv(s.charAt(r)))
                        c++;
                }

                if (c > maxc)
                    maxc = c;
            }

            return maxc;
        }

        public boolean checkv(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' ||
                   ch == 'o' || ch == 'u';
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        String s = "abciiidef";
        int k = 3;

        System.out.println(obj.maxVowels(s, k));
    }
}
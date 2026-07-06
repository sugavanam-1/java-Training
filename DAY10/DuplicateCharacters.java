public class DuplicateCharacters {
    public static void main(String[] args) {

        String s = "programming";

        for (char c = 'a'; c <= 'z'; c++) {

            int count = 0;

            for (int i = 0; i < s.length(); i++)
                if (c == s.charAt(i))
                    count++;

            if (count > 1)
                System.out.println(c);
        }
    }
}
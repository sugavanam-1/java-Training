public class LowerCaseCount {
    public static void main(String[] args) {

        String s = "Java Programming";

        int count = 0;

        for (int i = 0; i < s.length(); i++)
            if (Character.isLowerCase(s.charAt(i)))
                count++;

        System.out.println(count);
    }
}
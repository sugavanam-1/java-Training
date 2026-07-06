public class CountConsonants {
    public static void main(String[] args) {

        String s = "Education";

        int count = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLetter(c) &&
                    c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
                count++;
        }

        System.out.println(count);
    }
}
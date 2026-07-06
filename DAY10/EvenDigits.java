public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        int count = 0;

        for (int x : nums) {

            int digits = String.valueOf(x).length();

            if (digits % 2 == 0)
                count++;
        }

        System.out.println(count);
    }
}
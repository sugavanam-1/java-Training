import java.util.*;

class GuessGame {
    static int pickedNumber = 6;

    public static int guess(int num) {
        if (num == pickedNumber)
            return 0;
        else if (num < pickedNumber)
            return 1;
        else
            return -1;
    }
}

public class Main5 extends GuessGame {

    public static int guessNumber(int n) {
        int start = 1, end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

       
        pickedNumber = sc.nextInt();

        System.out.println(guessNumber(n));

        sc.close();
    }
}
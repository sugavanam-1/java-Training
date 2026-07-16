import java.util.*;

public class Main6 {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if ((long) mid * mid > x) {
                end = mid - 1;
            } else if ((long) mid * mid == x) {
                return mid;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int x = sc.nextInt();  
        System.out.println(mySqrt(x));

        sc.close();
    }
}
package Day24;
import java.util.*;

class VersionControl {
    // Change this value to test different cases
    static int badVersion = 4;

    public static boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

public class Main2 extends VersionControl {

    public static int firstBadVersion(int n) {
        int l = 1, h = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (isBadVersion(mid)) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();

        badVersion = sc.nextInt();

        System.out.println(firstBadVersion(n));

        sc.close();
    }
}
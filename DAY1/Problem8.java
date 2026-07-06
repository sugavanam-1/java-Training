

public class Problem8 {
    public static void main(String[] args) {
        int a = 15, b = 25, c = 20;

        if (a >= b && a >= c)
            System.out.println(a);
        else if (b >= c)
            System.out.println(b);
        else
            System.out.println(c);
    }

}

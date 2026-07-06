public class KidsCandies {
    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        int extra = 3;

        int max = candies[0];

        for (int x : candies)
            if (x > max)
                max = x;

        for (int x : candies)
            System.out.println((x + extra) >= max);
    }
}
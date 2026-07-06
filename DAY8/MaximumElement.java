public class MaximumElement {

    public static void main(String[] args) {

        int[] arr={12,45,7,89,34};

        int max=arr[0];

        for(int x:arr)
            if(x>max)
                max=x;

        System.out.println(max);
    }
}
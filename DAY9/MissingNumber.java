public class MissingNumber {

    public static void main(String[] args){

        int[] nums={3,0,1};

        int sum=0;

        for(int x:nums)
            sum+=x;

        int n=nums.length;

        int total=n*(n+1)/2;

        System.out.println(total-sum);
    }
}
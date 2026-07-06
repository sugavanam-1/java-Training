public class MaximumSubarray {
    public static void main(String[] args) {

        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        int max=nums[0];
        int sum=0;

        for(int x:nums){

            sum+=x;

            if(sum>max)
                max=sum;

            if(sum<0)
                sum=0;
        }

        System.out.println(max);
    }
}
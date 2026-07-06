import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums={1,2,3,1};

        HashSet<Integer> set=new HashSet<>();

        for(int x:nums){

            if(set.contains(x)){
                System.out.println(true);
                return;
            }

            set.add(x);
        }

        System.out.println(false);
    }
}
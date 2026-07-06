public class LongestPrefix {

    public static void main(String[] args){

        String[] strs={"flower","flow","flight"};

        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){

            while(!strs[i].startsWith(prefix))
                prefix=prefix.substring(0,prefix.length()-1);
        }

        System.out.println(prefix);
    }
}
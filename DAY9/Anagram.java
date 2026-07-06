import java.util.Arrays;

public class Anagram {

    public static void main(String[] args){

        String s="listen";
        String t="silent";

        char[] a=s.toCharArray();
        char[] b=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a,b));
    }
}
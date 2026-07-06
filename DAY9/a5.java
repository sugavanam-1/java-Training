public class LastWord {

    public static void main(String[] args){

        String s="Hello World";

        String[] a=s.split(" ");

        System.out.println(a[a.length-1].length());
    }
}
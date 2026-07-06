public class mutable_strings {
    static void main() {
        StringBuilder str = new StringBuilder("hello");
       // System.out.println(str.capacity());

        //str.trimToSize();

        str.append(123);
        str.append(3.14f);
        System.out.println(str);
        str.delete(2,5);

      String s =  str.toString();

      StringBuilder ref = new StringBuilder(s);

        System.out.println(str);
    }
}

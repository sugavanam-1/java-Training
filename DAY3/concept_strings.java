import java.util.Queue;
import java.util.Scanner;

public class concept_strings {
    static void main() {
        Scanner input = new Scanner(System.in);
       /* String str1 = "hello";
        String str2 = "Hello";*/
        String str1 = new String("hello");
        String str2 = new String("hello");

       /* String str2 = new String("training");
        String str3 = input.nextLine();*/
        if(str1.equals(str2))
            IO.println("equal");
        else IO.println("Not");

    }
}

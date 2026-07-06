import java.util.Scanner;

public class handling_exception {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome java program");
        int a = input.nextInt();
        int b = input.nextInt();
       try
       {
           System.out.println(b/a);
           System.out.println("task completed");
       }catch(Exception e){
           System.out.println(a/b);
           System.out.println("error");
       };

        System.out.println("end of the program");
        System.out.println("thank you");
    }
}

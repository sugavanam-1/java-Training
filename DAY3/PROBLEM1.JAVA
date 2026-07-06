public class Handling_string_functions {
    static void main() {
        String str1 ="hello world";
        String str2 ="Hello";
        String str3 ="this is string programming";

        String[] text = str3.split("i");

        int itr;
        for(itr=0;itr<text.length;itr+=1)
            System.out.println(text[itr]);




    }
}

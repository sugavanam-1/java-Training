public class anagram_array {
    static void main() {
        String str = "abcdefghijklzmnopqrsltuvwxyz" ;
        int str_count[] =new int[26];

        int itr;
        for(itr=0;itr<str.length();itr+=1)
        {
            str_count[str.charAt(itr) - 'a']++;
        }

        for(int ele : str_count)
            System.out.print(ele+" ");
    }
}

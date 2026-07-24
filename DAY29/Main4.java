import java.util.*;

public class Main4 {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord))
            return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String word = queue.poll();
                char[] chars = word.toCharArray();

                for (int j = 0; j < chars.length; j++) {

                    char original = chars[j];

                    for (char c = 'a'; c <= 'z'; c++) {

                        chars[j] = c;

                        String next = new String(chars);

                        if (next.equals(endWord))
                            return level + 1;

                        if (set.contains(next)) {
                            queue.offer(next);
                            set.remove(next); // Mark as visited
                        }
                    }

                    chars[j] = original;
                }
            }

            level++;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter begin word
        String beginWord = sc.next();

        // Enter end word
        String endWord = sc.next();

        // Enter number of words
        int n = sc.nextInt();

        List<String> wordList = new ArrayList<>();

        // Enter dictionary words
        for (int i = 0; i < n; i++) {
            wordList.add(sc.next());
        }

        System.out.println(ladderLength(beginWord, endWord, wordList));

        sc.close();
    }
}
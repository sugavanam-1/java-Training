import java.util.*;

public class Main3 {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();

        // Create adjacency list
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        // Build graph and indegree array
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add all courses with indegree 0
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int visited = 0;

        // Kahn's Algorithm (Topological Sort)
        while (!queue.isEmpty()) {
            int course = queue.poll();
            visited++;

            for (int next : graph.get(course)) {
                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        return visited == numCourses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter number of courses
        int numCourses = sc.nextInt();

        // Enter number of prerequisite pairs
        int m = sc.nextInt();

        int[][] prerequisites = new int[m][2];

        // Enter prerequisite pairs
        for (int i = 0; i < m; i++) {
            prerequisites[i][0] = sc.nextInt();
            prerequisites[i][1] = sc.nextInt();
        }

        System.out.println(canFinish(numCourses, prerequisites));

        sc.close();
    }
}
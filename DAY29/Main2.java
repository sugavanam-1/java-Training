import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

public class Main2 {

    private static Map<Node, Node> map = new HashMap<>();

    public static Node cloneGraph(Node node) {
        if (node == null)
            return null;

        if (map.containsKey(node))
            return map.get(node);

        Node clone = new Node(node.val);
        map.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }

    // Print graph using BFS
    public static void printGraph(Node node) {
        if (node == null)
            return;

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(node);
        visited.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.print("Node " + current.val + " -> ");

            for (Node neighbor : current.neighbors) {
                System.out.print(neighbor.val + " ");

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create sample graph:
        //
        // 1 ----- 2
        // |       |
        // |       |
        // 4 ----- 3
        //

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        System.out.println("Original Graph:");
        printGraph(node1);

        Node clonedGraph = cloneGraph(node1);

        System.out.println("\nCloned Graph:");
        printGraph(clonedGraph);
    }
}
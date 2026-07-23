import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main3 {

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(TreeNode node, List<Integer> result) {
        if (node == null)
            return;

        traverse(node.left, result);
        traverse(node.right, result);
        result.add(node.val);
    }

    // Build Binary Tree using Level Order Input (-1 represents null)
    public static TreeNode buildTree(Scanner sc) {
        int val = sc.nextInt();

        if (val == -1)
            return null;

        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            // Left child
            if (!sc.hasNextInt())
                break;
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.offer(current.left);
            }

            // Right child
            if (!sc.hasNextInt())
                break;
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.offer(current.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Enter tree in level order.
         * Use -1 for null nodes.
         * Example:
         * 1 2 3 -1 -1 4 5
         */

        TreeNode root = buildTree(sc);

        List<Integer> result = postorderTraversal(root);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
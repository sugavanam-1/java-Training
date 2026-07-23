import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main1 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            result.add(level);
        }

        return result;
    }

    // Build tree using level-order input (-1 = null)
    public static TreeNode buildTree(Scanner sc) {
        int val = sc.nextInt();

        if (val == -1)
            return null;

        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (!sc.hasNextInt())
                break;
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.offer(current.left);
            }

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
         * 3 9 20 -1 -1 15 7
         */

        TreeNode root = buildTree(sc);

        List<List<Integer>> result = levelOrder(root);

        // Print level-order traversal
        for (List<Integer> level : result) {
            System.out.print("[");
            for (int i = 0; i < level.size(); i++) {
                System.out.print(level.get(i));
                if (i != level.size() - 1)
                    System.out.print(", ");
            }
            System.out.println("]");
        }

        sc.close();
    }
}
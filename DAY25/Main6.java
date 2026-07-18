import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main6 {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 nodes.");
            sc.close();
            return;
        }
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;
        List<ListNode> nodes = new ArrayList<>();
        nodes.add(head);
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
            nodes.add(temp);
        }
        int pos = sc.nextInt();
        if (pos >= 0 && pos < n - 1) {
            deleteNode(nodes.get(pos));
        } else {
            System.out.println("Invalid position! Cannot delete the last node.");
            sc.close();
            return;
        }
        printList(head);
    }
}
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main2 {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(false);
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

        if (pos != -1) {
            temp.next = nodes.get(pos);
        }

        System.out.println(hasCycle(head));

        sc.close();
    }
}
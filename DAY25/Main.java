import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // Handle single node list
        if (head.next == null)
            return null;

        ListNode ptr = head;
        ListNode temp = head;

        // Move ptr forward n times
        int i = 1;
        while (i <= n) {
            ptr = ptr.next;
            i++;
        }

        // Remove the head node
        if (ptr == null)
            return head.next;

        // Move both pointers
        while (ptr.next != null) {
            ptr = ptr.next;
            temp = temp.next;
        }

        // Remove the nth node from end
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    // Print linked list
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

        // Enter number of nodes
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("List is empty");
            sc.close();
            return;
        }

        // Create linked list
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < size; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        // Enter n
        int n = sc.nextInt();

        head = removeNthFromEnd(head, n);

        // Print updated list
        printList(head);

        sc.close();
    }
}
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main7 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp;

        while (headA != null) {
            temp = headB;

            while (temp != null) {
                if (headA == temp) {
                    return headA;
                }
                temp = temp.next;
            }

            headA = headA.next;
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();
        int c = sc.nextInt();
        ListNode headA = null, tailA = null;

        for (int i = 0; i < a; i++) {
            ListNode node = new ListNode(sc.nextInt());
            if (headA == null) {
                headA = tailA = node;
            } else {
                tailA.next = node;
                tailA = node;
            }
        }
        ListNode headB = null, tailB = null;

        for (int i = 0; i < b; i++) {
            ListNode node = new ListNode(sc.nextInt());
            if (headB == null) {
                headB = tailB = node;
            } else {
                tailB.next = node;
                tailB = node;
            }
        }
        ListNode commonHead = null, commonTail = null;
        for (int i = 0; i < c; i++) {
            ListNode node = new ListNode(sc.nextInt());
            if (commonHead == null) {
                commonHead = commonTail = node;
            } else {
                commonTail.next = node;
                commonTail = node;
            }
        }
        if (tailA != null)
            tailA.next = commonHead;
        else
            headA = commonHead;

        if (tailB != null)
            tailB.next = commonHead;
        else
            headB = commonHead;
        ListNode result = getIntersectionNode(headA, headB);

        if (result != null)
            System.out.println(result.val);
        else
            System.out.println("No Intersection");

        sc.close();
    }
}
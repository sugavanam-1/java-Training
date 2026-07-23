import java.util.*;

public class Main2 {

    static class MyStack {

        Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }

        // Push element onto stack
        public void push(int x) {
            q.offer(x);

            int size = q.size();
            while (size > 1) {
                q.offer(q.poll());
                size--;
            }
        }

        // Removes the element on top of the stack
        public int pop() {
            return q.poll();
        }

        // Get the top element
        public int top() {
            return q.peek();
        }

        // Returns whether the stack is empty
        public boolean empty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyStack stack = new MyStack();

        // Number of operations
        int n = sc.nextInt();

        while (n-- > 0) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Push
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    // Pop
                    if (!stack.empty())
                        System.out.println(stack.pop());
                    else
                        System.out.println("Stack is empty");
                    break;

                case 3:
                    // Top
                    if (!stack.empty())
                        System.out.println(stack.top());
                    else
                        System.out.println("Stack is empty");
                    break;

                case 4:
                    // Empty
                    System.out.println(stack.empty());
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
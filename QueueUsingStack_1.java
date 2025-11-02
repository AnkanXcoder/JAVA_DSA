import java.util.Stack;

public class QueueUsingStack_1 {
    static class myQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Enqueue operation: O(1)
        void enqueue(int val) {
            s1.push(val);
        }

        // Dequeue operation: O(n) worst case
        void dequeue() {
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            // Move all elements from s1 → s2 if s2 is empty
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            s2.pop();
        }

        // Front operation: O(n) worst case
        public int front() {
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // If s2 has elements, top of s2 is the front
            if (!s2.isEmpty()) {
                return s2.peek();
            }

            // Otherwise, move s1 → s2 and peek
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int front = s2.peek();
            return front;
        }

        int size() {
            return s1.size() + s2.size();
        }
    }

    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Front:- " + q.front());
        q.dequeue();
        System.out.println("Front after one dequeue:- " + q.front());
        System.out.println("Queue size:- " + q.size());
    }
}

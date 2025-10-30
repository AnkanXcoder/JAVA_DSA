
import java.util.Stack;

public class QueueUsingStack {
    static class Queue {
        private Stack<Integer> s = new Stack<>();

        void enqueue(int x) {
            s.push(x);
        }

        int dequeue() {
            if(s.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = s.pop();
            if(s.isEmpty()) 
                return x;
            int item = dequeue();
            s.push(item);
            return item;
        }

        int front() {
            if(s.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = s.pop();
            if(s.isEmpty()) {
                s.push(x);
                return x;
            }
            int item = front();
            s.push(item);
            return item;
        }

        int size() {
            return s.size();
        }
    }

    public static void main(String[] args) {
       Queue q = new Queue();
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(50);
       System.out.println("Front:"+q.front()); 
       System.out.println("Dequeue:"+q.dequeue());
       System.out.println("Front:"+q.front()); 
       System.out.println("Size:"+q.size());
    }
}

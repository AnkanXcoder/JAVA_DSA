import java.util.Stack;

public class QueueUsingTwoStack {
   
    static class myQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void enqueue(int val) {
            // s1 --> s2
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            //push elements in s1
            s1.push(val);
            //s2 --> s1
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int dequeue() {
            if(s1.isEmpty()) {
                System.out.println("Queue is underflow");
                return -1;
            }
            return s1.pop();
        }

        public int front() {
            if(s1.isEmpty()) {
                System.out.println("Queue is underflow");
                return -1;
            }
            return s1.peek();
        }

        public int size() {
            return s1.size();
        }
    }

    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(25);
        q.enqueue(50);
        q.enqueue(75);
        q.enqueue(100);
        System.out.println("Size of queue:-"+q.size());
        System.out.println("front of queue:-"+q.front());
        System.out.println("Dequeue:-"+q.dequeue());

    }
        
    
}

class Node {
    int data;
    Node next;
    
    Node(int val) {
        data = val;
        next = null;
    }
}

class myQueue {
   private Node front;
   private Node rear;
   private int currSize;

   public myQueue() {
    currSize = 0;
    front = rear = null;
   }
   public boolean isEmpty() {
    return  front == null;
   }
   
   public void enqueue(int x) {
    Node newNode = new Node(x);
    if(isEmpty()) {
        front = rear = newNode;
    }
    else {
        rear.next = newNode;
        rear = newNode;
    }
    currSize++;
   }

   public int dequeue() {
    if(isEmpty()) {
        System.out.println("Queue underflow");
        return -1;
    }
    Node temp = front;
    int removeData = temp.data;
    front = front.next;
    if(front == null) 
    rear = null;
    currSize--;
    return removeData;
   }
   public int getFront() {
    if(isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }
    return front.data;
   }
   public int size() {
    return currSize;
   }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = front;
        System.out.print("Queue elements (front --> rear): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueUsingLL {
    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(20);
        q.enqueue(40);
        q.enqueue(60);
        q.enqueue(80);
        q.display();
        System.out.println("Front value is:"+q.getFront());
        q.dequeue();
        q.display();
    }    
}

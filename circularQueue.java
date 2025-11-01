

class myQueue {
    private int arr[];
    private int front;
    private int size;
    private int capacity;

    public myQueue(int cap) {
        capacity = cap;
        arr = new int[capacity];
        front = 0;
        size = 0;
    }

    public void enqueue(int val) {
        if(size == capacity) {
            System.out.println("Queue is fully");
            return;
        }
        int rear = (front+size)%capacity;
        arr[rear] = val;
        size++;
    }

    public int dequeue() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int res = arr[front];
        front = (front+1)%capacity;
        size--;
        return res;
    }

    public int getRear() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int rear = (front+size-1) % capacity;
        return arr[rear];
    }

    public int getFront() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }  
    
    public void display() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements");
        for(int i=0;i<size;i++) {
            int index = (front+i)%capacity;
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }
}

public class circularQueue {
    public static void main(String[] args) {
       myQueue q = new myQueue(5);
       q.enqueue(4);
       q.enqueue(2007);
       q.enqueue(10);
       q.enqueue(2006);
       q.display();
       System.out.println("Front:-"+q.getFront());
       System.out.println("Rear:-"+q.getRear());
       System.out.println("dequeue:-"+q.dequeue());
       q.display();
       System.out.println("Front:-"+q.getFront());
       System.out.println("Rear:-"+q.getRear());
    }
    
}

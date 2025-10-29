

class myQueue {
    private int[] arr;
    private int capacity;
    private int size;

    public myQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int x) {
        if(isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        arr[size] = x;
        size++;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        for(int i=1;i<size;i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    public int getFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[0];
    }

    public int getRear() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[size-1];
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements: ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

public class QueueUsingArray {
    public static void main(String[] args) {
        myQueue q = new myQueue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        System.out.println("Front: " + q.getFront());
        System.out.println("Rear: " + q.getRear());
        q.enqueue(40);
        q.display();
    }
    
}

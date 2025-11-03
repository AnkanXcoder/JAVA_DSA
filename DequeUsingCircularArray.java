

class myQueue {
    private int arr[];
    private int capacity;
    private int front;
    private  int size;

    public myQueue(int cap) {
        capacity = cap;
        arr =new int[cap];
        front = 0;
        size = 0;
    }

    public void insertRear(int val) {
        if (size == capacity) {
            System.out.println("Deque is full");
            return;
        }
        int rear = (front + size)% capacity;
        arr[rear] = val;
        size++;
    }

    public void insertFront(int val) {
        if(size == capacity) {
            System.out.println("Deque is full");
            return;
        }
        front = (front - 1 + capacity) % capacity;
        arr[front] = val;
        size++;
    }

    public int deleteRear() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int rear = (front + size -1)%capacity;
        int res = arr[rear];
        size--;
        return res;
    }

    public int deleteFront() {
        if(size == 0) {
            System.out.println("Queue  is empty");
            return -1;
        }
        int rear = (front + size -1) % capacity;
        int res = arr[rear];
        size--;
        return res;
    }

    public int frontEle() {
        return arr[front];
    }
    
    public int rearEle() {
        int rear = (front+size-1)%capacity;
        return arr[rear];
    } 
    public void display() {
    if(size == 0) {
        System.out.println("Deque is empty");
        return;
    }
    System.out.print("Deque elements (front --> rear): ");
    for(int i = 0; i < size; i++) {
        int index = (front + i) % capacity;
        System.out.print(arr[index] + " ");
    }
    System.out.println();
   }

}

public class DequeUsingCircularArray {
    public static void main(String[] args) {
        myQueue q = new myQueue(4);
        q.insertFront(4);
        q.insertFront(3);
        q.insertRear(10);
        q.insertRear(15);
        q.display();
        System.out.println("front:-"+q.frontEle());
        System.out.println("Rear:-"+q.rearEle());

    }
    
}

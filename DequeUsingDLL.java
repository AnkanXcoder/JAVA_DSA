class Node {
    int data;
    Node prev;
    Node next;

    Node(int val) {
        data = val;
        prev = null;
        next = null;
    }
}

class MyDeque {
    Node front;
    Node rear;

    MyDeque() {
        front = null;
        rear = null;
    }

    // Insert at the front
    void insertFront(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    // Insert at the rear
    void insertRear(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            rear = front = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Delete from the front
    int deleteFront() {
        if (front == null) {
            System.out.println("Underflow");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null)
            rear = null;
        else
            front.prev = null;

        return val;
    }

    // Delete from the rear
    int deleteRear() {
        if (rear == null) {
            System.out.println("Underflow");
            return -1;
        }

        int val = rear.data;
        rear = rear.prev;

        if (rear == null)
            front = null;
        else
            rear.next = null;

        return val;
    }

    // Get front element
    int getFront() {
        if (front == null) {
            System.out.println("Deque is empty");
            return -1;
        }
        return front.data;
    }

    // Get rear element
    int getRear() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return -1;
        }
        return rear.data;
    }

    // Check if deque is empty
    boolean isEmpty() {
        return front == null;
    }

    // Display all elements
    void display() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }

        Node temp = front;
        System.out.print("Deque: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DequeUsingDLL {
    public static void main(String[] args) {
        MyDeque dq = new MyDeque();

        dq.insertFront(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertRear(25);

        dq.display();

        System.out.println("Front: " + dq.getFront());
    

        dq.deleteFront();
        dq.display(); 

        dq.deleteRear();
        dq.display(); 
    }
}

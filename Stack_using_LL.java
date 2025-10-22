
//Node structure
class  Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// stack implementation using Linked list
class Mystack {
    Node top;
    int count;

    public Mystack() {
        top = null;
        count = 0;
    }

    //push operation
    public void push(int val) {
        Node temp = new Node(val);
        temp.next = top;
        top = temp;
        count++;
    }

    //pop operation
    public int pop() {
        if(top == null) {
            System.out.println("Stack Underflow");
            return  -1;
        }
        int popped = top.data;   // save the top element’s data
        top = top.next;
        count--;
        return popped;
    }

    //peek/top elements
    public int peek() {
        if(top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return  top.data;
    }
    
    //empty function
    public boolean  isEmpty() {
        return  top == null;
    }

    public int size() {
        return count;
    }  

    public void display() {
        if(top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack elements (top to bottom):");
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Stack_using_LL {
    public static void main(String[] args) {
        Mystack s = new Mystack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.pop();
        s.display();
        System.out.println("size of stack:"+s.size());
        System.out.println("Top element:"+s.peek());
        System.out.println("Stack is empty:"+s.isEmpty());

    }
    
}

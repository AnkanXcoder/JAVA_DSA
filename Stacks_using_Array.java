
class MyStack {
// array to store elements
private int arr[];

//max size of stack;
private  int capacity;

// index of top element
private int top;

//constructor
public MyStack(int cap) {
    capacity = cap;
    arr = new int[capacity];
    top = -1;
}

//push operation 
public void push(int val) {
    if(top == capacity-1) {
        System.out.println("Stack overflow!!");
        return;
    }
    arr[++top] = val;
    System.out.println(val+" pushed to stack");

}

//pop operation
public int pop() {
    if(top == -1) {
        System.out.println("Stack Underflow");
        return -1;
    }
    int popped = arr[top--];
    System.out.println(popped+ " popped from stack");
    return popped;
}

//peek(top element) 
public int peek() {
    if(top == -1) {
        System.out.println("Stack is empty");
        return -1;
    }
    return arr[top];
}

// isEmpty 
public boolean isEmpty() {
    return top == -1;
}
 // isFull
 public boolean isFull() {
    return top == capacity-1;
 }

 //Display stack elements
 public void display() {
    if(isEmpty()) {
        System.out.println("Stack is empty: ");
        return;
    }
    System.out.println("Stack elements: ");
    for(int i = 0; i<=top;i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}


public class Stacks_using_Array {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(5);
        s.display();
        System.out.println("Top element: "+s.peek());
        s.pop();
        s.display();
        System.out.println("Is stack empty?" + s.isEmpty());
        System.out.println("Is stack is full?"+s.isFull());


    }
    
}

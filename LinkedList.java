public class LinkedList {
  public static class Node  {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;
  public void addFirst(int data){
    // step 1
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    // step 2
    newNode.next = head;
    // step 3
    head = newNode;

  }
  public void addLast(int data ){
    //step 1
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    //step 2 
    tail.next = newNode;
    //step 3
    tail = newNode;
  }
  public void print(){
    if(head == null){
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"-->");
        temp = temp.next;
    }
    System.out.println("null");
  }
  public void add(int idx, int data){
    if(idx == 0){
      addFirst(data);
      return;
    }
    Node newNode = new Node(data); 
    size++;
    Node temp = head;
    int i = 0;

    while(i < idx-1){
      temp = temp.next;
      i++; 
    }
    // i = idx-1
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(2);
    ll.addFirst(1);   
    ll.addLast(4);
    ll.add(2, 3);
    ll.addLast (5);
    ll.print();
    System.out.println(ll.size);
  }


}

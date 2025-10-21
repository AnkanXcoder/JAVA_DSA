

class Node {
    int data;
    Node prev;
    Node next;
    Node(int val) {
        data = val;
        prev = next = null;
    }
}


public class doubleLL {
    static Node CreateDoubleLL(int arr[]) {
        if(arr.length==0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;

        }
        return head;
    }

    static void traveseF(Node head) {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data+"->");
            curr = curr.next;

        }
        System.out.print("null");
    }

    static void traveseB(Node head) {
        if(head == null) return ;
        Node curr = head;
        while(curr.next!=null) {
            curr = curr.next;
        }
        while(curr!=null) {
            System.out.print(curr.data+"->");
            curr = curr.prev;
        }
        System.out.print("null");
    }
    static Node insertAtBegin(Node head,int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        if(head!=null) {
            head.prev = newNode;
        }
        return newNode;
    }
    static Node insertAtEnd(Node head,int val) {
        Node newNode = new Node(val);
        Node curr = head;
        while(curr.next!=null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
        newNode.prev = curr;
        return head;

    }
    static Node insertAtPos(Node head,int pos,int val) {
        if(pos<1) {
            return head;
        }
        if(pos==1) {
            Node newNode = new Node(val);
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        Node curr = head;
        for(int i=1;i<pos-1&&curr!=null;i++) {
            curr = curr.next;
        }
        if(curr==null) {
            return head;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        newNode.prev = curr;
        if (curr.next != null) {
        curr.next.prev = newNode;
        }
        curr.next = newNode;
        return head;

    }
    static Node deleteAtBegin(Node head) {
        if(head==null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        if(head!=null){
        head.prev = null;
        }
        return head;
    }

    static Node deleteAtend(Node head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            head = null;
            return null;
        }
        Node curr = head;
        while(curr.next!=null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    static Node deleteAtspe(Node head,int pos) {
        if(head==null) {
            return null;
        }
        if(pos==1){
            return deleteAtBegin(head);
        }
        Node temp = head;
        for(int i=1;i<pos&&temp!=null;i++) {
            temp = temp.next;
        }
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;

        return head;

    }

    static void printDLL(Node head) {
        Node temp =  head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        int [] arr = {4,5,10,14,23,28};
        Node head = CreateDoubleLL(arr);
        head = insertAtBegin(head, 1);
        head = insertAtEnd(head, 100);
        head = insertAtPos(head, 3, 45);
        head = deleteAtBegin(head);
        head = deleteAtend(head);
        head = deleteAtspe(head, 2);
        System.out.print("Linked List:");
        printDLL(head);
    }
}

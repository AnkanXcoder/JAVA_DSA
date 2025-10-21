class Node {
    int data;
    Node next;
    Node (int val) {
        data = val;
        next = null;
    }
}

public class circularLL {

   static void printList(Node head) {
    if (head == null) return;

    Node temp = head;
    while (true) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
        if (temp == head) break; // stop when back at head
    }
    System.out.println("(back to head)");
}

    static Node insertingAtbegin(Node head, int val) {
    Node newNode = new Node(val);

        if(head == null) {
          newNode.next = head;
          return newNode;  
        }
        Node temp = head;
        while(temp.next!=head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        return newNode;
        
    }

    static Node insertingAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
        newNode.next = newNode;
        return newNode;
    }
       
        Node temp = head;
        while(temp.next!=head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        return head;
    }

    static Node insertingAtPos(Node head, int val, int pos) {
        Node newNode = new Node(val);
        if(pos<1) {
            return head;
        }
        if(pos == 1) {
            return insertingAtbegin(head, val);
        }
        Node curr = head;
        for(int i=1;i<pos-1 && curr!=head;i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static Node deleteHead(Node head) {
        if(head == null) {
            return null;
        }
        if(head.next == head) {
            return null;   
        }
        Node temp = head;
        while(temp.next!=head) {
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
        return head;
    }
    static Node deleteEnd(Node head) {
        if(head == null) {
            return null;
        }
        if(head.next == head) {
            return null;
        }
        Node temp = head;
        while(temp.next.next!=head) {
            temp = temp.next;
        }
        temp.next = head;
        return head;
    }

    static Node deleteAtspe(Node head,int pos) {
        if(head == null) {
            return null;
        }
        if(pos==1) {
            return deleteHead(head);
        }
        Node temp = head;
        for(int i=1;i<pos-1&&temp.next!=head;i++) {
            temp = temp.next;
        }
        Node toDelete = temp.next;
        temp.next = toDelete.next;
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        head = insertingAtbegin(head, 5);
        head = insertingAtEnd(head, 50);
        head = insertingAtPos(head, 35, 2);
        head = deleteHead(head);
        head = deleteEnd(head);
        head = deleteAtspe(head, 2);
        System.out.print("Linked List:");
        printList(head);
    }
    
}

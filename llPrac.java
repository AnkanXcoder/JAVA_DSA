

class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}


public class llPrac {

    static  Node createLL(int arr[]) {
        if(arr.length==0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i=1;i<arr.length;i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    static Node insertAtBegin(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;

    }

    static Node insertAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        if(head == null) {
            return newNode;
        }
        Node curr = head;
        while(curr.next!=null) {
            curr = curr.next;

        }
        curr.next = newNode;
        return head;
    }

    static Node deleteAtBegin(Node head) {
        if(head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
        
    }

    static Node deleteAtEnd(Node head) {
        if(head.next==null) {
            head = null;
            return null;
        }
        Node curr = head;
        while(curr.next.next != null){ 
            curr = curr.next;
        }
            curr.next = null;
            return head;
    }

    static Node insertAtSpeLoc(Node head, int val,int pos){
        if(pos<1) {
            return head;
        }
        
        if(pos==1) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;

        }

        Node curr = head;
        for(int i=1;i<pos-1&& curr!=null;i++) {
            curr = curr.next;
        }

        if(curr==null) 
            return head;

        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static Node deletionAtSpeLoc(Node head, int pos) {
    Node temp = head;
    if(pos == 1) {
        head = temp.next;
        return head;
    }
    Node prev = null;
    for(int i=1;i<pos;i++) {
        prev = temp;
        temp = temp.next;
    }
    prev.next = temp.next;
    return head;
}

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public static void main(String[] args) {
        int arr[] = {10,78,89,52,25,23,45,14,4};
        Node head = createLL(arr);
        head = insertAtBegin(head, 2007);
        head = insertAtEnd(head, 2006);
        // head = deleteAtBegin(head);
        // head = deleteAtEnd(head);
        head = insertAtSpeLoc(head, 4407, 2);
        head = deletionAtSpeLoc(head, 3);
        System.out.print("Linked List:");
        printList(head);
       
        
    }
    
}

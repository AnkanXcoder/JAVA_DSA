class Node {
    int data;
    Node next;
  
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
}

public class reverseLL {

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

    static Node reverseNode(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr!=null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

        }
        return prev;
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
        int arr[] = {10, 78, 89, 52, 25, 23, 45, 14, 4};
        Node head = createLL(arr);

        System.out.print("Original Linked List: ");
        printList(head);

        head = reverseNode(head);  // update head after reversing

        System.out.print("Reversed Linked List: ");
        printList(head);
    }
    
}

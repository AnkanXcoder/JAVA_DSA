class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }    
}

public class LLUsingArray {
    static Node createList(int[] arr) {
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
     static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    static void travese(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data+"->");
        travese(head.next);
    }
    public static void main(String args[]) {
        int [] arr = {10,78,85,56,23,42};
        Node head = createList(arr);
        System.out.print("Linked List:");
        travese(head);
    }
    
}

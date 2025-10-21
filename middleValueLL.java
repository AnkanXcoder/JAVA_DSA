class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class middleValueLL {

    static int getMiddle(Node head) {
        Node fastptr = head;
        Node slowptr = head;

        while(fastptr!=null && fastptr.next!=null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        return slowptr.data;
    }

    static boolean detectloop(Node head) {
        Node slow = head;
        Node fast = head;

        while(slow!=null && fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Node head = new Node(40);
        head.next = new Node(45);
        head.next.next = new Node(50);
        head.next.next.next = new Node(55);
        head.next.next.next.next = new Node(60);
        head.next.next.next.next.next = head.next.next;
        // System.out.println("Middle value of the linked list:"+ getMiddle(head));
        System.out.println("Detect cycle:"+detectloop(head));
       
    }
}

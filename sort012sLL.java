class Node {
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
}

public class sort012sLL {

    static Node sort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        //Dummy Node 
        Node zeroD = new Node(-1);
        Node oneD = new Node(-1);
        Node twoD = new Node(-1);
        
        //Dummy Node's tail
        Node zero = zeroD;
        Node one = oneD;
        Node two = twoD;

        //traversal 

        Node curr = head;
        while(curr!=null) {
            if(curr.data == 0){
                zero.next = curr;
                zero = zero.next;
            }
            else if(curr.data == 1) {
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        //connect nodes

        zero.next = (oneD.next!=null)? oneD.next: twoD.next;
        one.next = twoD.next;
        two.next = null;

        head = zeroD.next;
        
        return head;
    }  

    //printList

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

     public static void main(String[] args) {
        // Create sample linked list: 1 -> 2 -> 0 -> 1 -> 2 -> 0
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        System.out.println("Original list:");
        printList(head);

        head = sort(head);

        System.out.println("Sorted list:");
        printList(head);
    }
    
}

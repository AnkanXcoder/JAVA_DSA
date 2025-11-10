class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class SumOfNode {

     static class BinaryTree {
        static  int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return  newNode;

        }
    }

  
    // Sum of Node
    public static int SumofNode(Node root) {
        if(root == null) {
            return 0;
        }
        
        int leftSum = SumofNode(root.left);
        int rightSum = SumofNode(root.right);

        return  leftSum+rightSum+root.data;
    }

    public static int heightofNode(Node root) {
        if(root == null) {
            return 0;
        }
        int leftheight = heightofNode(root.left);
        int rightheight = heightofNode(root.right);
        int HeightTree = Math.max(leftheight, rightheight)+1;
        return HeightTree;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(" Height:-  " + heightofNode(root));
    }
    
}


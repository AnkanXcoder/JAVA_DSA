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
    

    //height of Tree
    public static int heightofNode(Node root) {
        if(root == null) {
            return 0;
        }
        int leftheight = heightofNode(root.left);
        int rightheight = heightofNode(root.right);
        int HeightTree = Math.max(leftheight, rightheight)+1;
        return HeightTree;
    }

    public static int diameter_aap1(Node root) {  //O(N^2)
        if(root == null) {
            return 0;
        }
        int diam1 = diameter_aap1(root.left);
        int diam2 = diameter_aap1(root.right);
        int diam3 = heightofNode(root.left) +heightofNode(root.right) + 1;
        return Math.max(diam3, Math.max(diam1,diam2));
    }
    
    static class TreeInfo {
        int ht;
        int diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }


    public static  TreeInfo diameter_aap2(Node root) {
        if(root == null) {
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter_aap2(root.left);
        TreeInfo right = diameter_aap2(root.right);
        int myHeight = Math.max(left.ht, right.ht)+1;

        int diam1 = left.diam;
        int diam2 = left.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo  myinfo = new TreeInfo(myHeight, mydiam);
        return myinfo;
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(" diameter of the tree:-  " + diameter_aap2(root).diam);
    }
    
}


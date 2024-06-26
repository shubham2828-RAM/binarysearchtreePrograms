package BinarySearchTree;


// comment is shubham sharma 
public class BalancedTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static int height(Node root){
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 +Math.max(height(root.left),height(root.right));
    }
    public static boolean isBalanced(Node root){
        if (root == null) return true;
        int lh = height(root.left);
        if (root.left != null) lh++;
        int rh = height(root.right);
        if (root.right != null) rh++;
        int d = lh - rh;
        if (d <0) d = -d; /*we are making the d +ve*/
        if (d >1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        System.out.println(isBalanced(root));

    }
}

package BinarySearchTree;

public class NthLevel {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void Nthlev(Node root,int n ) {
//        In order -> left  right  root
        if (root == null) return;
        if (n == 1) System.out.print(root.val+" ");
//        System.out.print(root.val + " ");
        Nthlev(root.left,n-1);
        Nthlev(root.right,n-1);
    }
    public static int height(Node root){
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 +Math.max(height(root.left),height(root.right));
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
        int level = height(root);
        for (int i =1; i<= level; i++){
            Nthlev(root,i);
        }



    }
}

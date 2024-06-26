package BinarySearchTree;

public class Implementation {
    public static class Node{
        int val;
        Node left;
        Node right;

        public  Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if (root == null ) return;
        System.out.print(root.val +" -> ");
        if (root.left!= null) System.out.print(root.left.val+" ");
        if (root.right!= null) System.out.print(root.right.val+" ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void preorder(Node root){
        if (root == null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static int sum(Node root){
        if (root == null) return 0 ;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int size(Node root){
        if (root == null) return 0;
        return 1+ size(root.left) + size(root.right);
    }
    public static int max(Node root){
        if (root == null ) return  Integer.MIN_VALUE; /*if the nodes given with negative sign*/
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int height(Node root){
        if (root == null ) return 0;
        if (root.left == null && root.right == null) return 0;
        return 1+ Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        Node root  = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node  (11);
        b.right = e;
        display(root);
//          preorder(root);
//        System.out.println("The Sum of all the nodes : "+sum(root));
//        System.out.println("The size of this tree is: "+size(root));
//        System.out.println("The max node of the tree: "+max(root));
    }

}

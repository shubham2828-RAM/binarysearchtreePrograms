package BinarySearchTree;

public class PreOrderImplementation {
    public static class Node{
        int val;
        Node left;
        Node right;

        public  Node(int val){
            this.val = val;
        }
    }
    public static void preOrder(Node root){
//        pre order -> root left right
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
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
        Node e = new Node(11);
        b.right = e;
        preOrder(root);

    }
}

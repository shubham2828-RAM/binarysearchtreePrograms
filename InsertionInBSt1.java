package BinarySearchTree;

public class InsertionInBSt1 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    class Insertion{
        Node root;
        Insertion(){
            root = null;
        }
    }
    public static void preOrder(Node root){
//        pre order -> root left right
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void insert(int item){
    }
    public static void main(String[] args) {

    }
}

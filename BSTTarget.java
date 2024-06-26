package BinarySearchTree;

public class BSTTarget {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static boolean searchBST(Node root, int target){
        if (root == null) return false;
        if (root.val == target ) return true;
        if (root.val > target) return searchBST(root.left,target);
        if (root.val < target) return searchBST(root.right,target);
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        Node a = new Node(2);
        Node b = new Node(7);
        root.left = a;
        root.right= b;
        Node c = new Node(1);
        Node d = new Node(3);
        a.left = c;
        a.right = d;
        int target = 4;
//        Node ans = searchBST(root,targt);
        System.out.println("The target is available or not: "+searchBST(root,target));
    }
}

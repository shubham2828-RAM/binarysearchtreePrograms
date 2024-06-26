package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BoundaryPrint {
    public static class Node{
        int val;

        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
    public static int height(Node root){
        if(root == null || (root.left ==null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void nthlev(Node root, int n ){    // left to right
        if (root == null) return;
        if (n == 1){
            System.out.print(root.val+" ");
            return;
        }
        nthlev(root.left,n-1);
        nthlev(root.right,n-1);

    }
    private static Node constructbfs(String[] arr) {
        int x = Integer.parseInt(arr[0]);      // basically parseInt() is used to convert string into the interger.
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i =1;
        while (i < n-1){
            Node temp = q.remove();
            Node left = new Node(0);   // these values are unpridictable no worries
            Node right  = new Node(100);

            if (arr[i].equals("")){
                left= null;
            }
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i+1].equals("")){
                right = null;
            }
            else {
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;   // at any condition the left and right must be added into the queue;
            temp.right= right;
            i+=2;

        }
        return root;
    }
    public static void main(String[] args) {
        String[] arr2 = {"1","2","3","4","5","","6","7","","8","","9","10","","11","","12","","13","","14","15","16","","17","","","18","","19","","","","20","21","22","23","","24","25","26","27","","","28","",""};
        Node root = constructbfs(arr2);
        bounaryfun(root);

    }

    private static void bounaryfun(Node root) {
        leftbounary(root);
        System.out.println();
        bottombounary(root);
        System.out.println();
        rightbounary(root.right);
    }

    private static void leftbounary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        System.out.print(root.val+" ");
        if (root.left != null) leftbounary(root.left);
        else leftbounary(root.right);
    }
    private static void bottombounary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {    // in this, if the element is at leaf node
            System.out.print(root.val+" ");
            return;
        }
        bottombounary(root.left);
        bottombounary(root.right);
    }
    private static void rightbounary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        if (root.right != null) rightbounary(root.right);
        else rightbounary(root.left);
        System.out.print(root.val+" ");// if we place this print line in this loc. then it will print the elements in the reverse order
    }



}

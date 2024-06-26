package BinarySearchTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.nio.file.Files.delete;

public class deleteNode {
    public static class Node{
        int val;

        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
    private static Node constructbfs(String[] arr) {
        int x = Integer.parseInt(arr[0]);      // basically parseInt() is used to convert string into the interger.
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i =1;
        while (i < n-1){
            Node temp = q.remove();   // for peek value
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
    private  static void preorder(Node root){
        if(root == null ) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root, List<Integer> ar){
        if(root == null) return;
        inorder(root.left,ar);
        ar.add(root.val);
//        System.out.print(root.val+" ");
        inorder(root.right,ar);
    }
    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node root = constructbfs(arr);
        List<Integer> ar = new ArrayList<>();
        inorder(root,ar);
        for (int i =0; i<ar.size(); i++){
            System.out.print(ar.get(i)+" ");
        }
        System.out.println();
        int val  = 28;
        int idx = -1;
        for (int i =0; i<ar.size();i++){
            if (ar.get(i) == val){
                idx =i;
                break;
            }
        }
        int pred = ar.get(idx -1);
        int suc = ar.get(idx +1);
        System.out.println("Pred is: "+pred);
        System.out.print("Succ is: "+suc);
//        preorder(root);
//        System.out.println();
//        delete(root,34);
//        preorder(root);
    }

    private static void delete(Node root, int target) {
        if (root == null) return;
        if (root.val > target)  {    // go left
            if (root.left == null);
            if (root.left.val == target) {
                Node l = root.left;
                if(l.left == null && l.right == null) root.left = null; // for 0 child or leaf node
                else if (l.left ==null || l.right == null) {   // for 1 child
                    if (l.left != null ) root.left = l.left;
                    else root.left= l.right;

                }
            }
            else delete(root.left,target);
        }
        else {
//            if (root.right == null);
//            if (root.right.val == target) root.right = null;    // this is will be done for 0 child
//            else delete(root.right,target);
            if (root.right == null);
            if (root.right.val == target){
                Node r = root.right;
                if (r.left == null && r.right == null) root.right =null; // for 0 child or leaf node
                else if(r.left == null || r.right == null)  {      // for 1 child
                    if (r.left != null) root.right = r.left;
                    else root.right = r.right;

                }
            }
            else delete(root.right,target);


        }
    }
}

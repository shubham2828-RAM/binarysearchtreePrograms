package BinarySearchTree;


public class InsertionInBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static Node insertIntoBSt(Node root, int target){
        if (root == null)return new Node(target);
//
        if (root.val > target)  /*go to left*/
        {
            if (root.left == null) root.left = new Node(target);
            else insertIntoBSt(root.left, target);
        }
        else  /*root.val < target -> go to right*/
        {
            if (root.right == null) root.right = new Node(target);
            else insertIntoBSt(root.right,target);
        }
        return root ;
    }

    public static Node insertintoBST12(Node root, int target){  // revision
        if (root == null) return new Node(target);
        if (root.val > target) {// go to left
           if (root.left == null) root.left = new Node(target);
           else insertintoBST12(root.left,target);
        }
        else   // root.right < target -> go to right
        {
            if (root.right == null) root.right = new Node(target);
            else insertintoBST12(root.right, target);

        }
        return root;

    }
    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(3);
        Node b = new Node(6);
        root.left = a;
        root.right= b;
        Node c = new Node(2);
        Node d = new Node(4);
        a.left = c;
        a.right = d;
        int target = 7;
//        Node ans = insertIntoBSt(root,target);
//        Node ans = new Node(insertIntoBSt(root,target));
//        System.out.println(ans);
        Node ans = insertIntoBSt(root,target);
        System.out.println(ans.val);


    }
}

//this is in the leet code by PW


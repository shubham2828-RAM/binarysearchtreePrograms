package BinarySearchTree;

public class    SameTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static boolean isSameTree(Node p, Node q){ /*In this Node p and Node q here p and q are root values of trees*/
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));

    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root1.left = a;
        root1.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;

        Node root2 = new Node(20);
        Node f = new Node(40);
        Node g = new Node(100);
        root2.left = f;
        root2.right = g;
        Node h = new Node(60);
        Node i = new Node(50);
        f.left = h;
        f.right = i;
        Node j = new Node(110);
        g.right = j;
        System.out.println(isSameTree(root1,root2));



    }
}

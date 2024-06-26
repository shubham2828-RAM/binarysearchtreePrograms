package BinarySearchTree;

public class ConvertSortedArrayToBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static Node helper(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        int mid = (lo + hi) / 2;
        Node root = new Node(nums[mid]);
        root.left = helper(nums, lo, mid - 1);
        root.right = helper(nums, mid + 1, hi);
        return root;
    }
    public static Node sortedArryatoBST(int[] nums){
        int n= nums.length;
        return helper(nums,0,n-1);

    }

    public static void main(String[] args) {

        int[] nums = {2,4,6,8,10,12};
        Node ans = sortedArryatoBST(nums);
//        System.out.println(sortedArryatoBST(nums));

        System.out.println(ans.val);


    }
}

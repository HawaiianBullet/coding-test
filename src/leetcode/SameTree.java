package leetcode;

// https://leetcode.com/problems/same-tree/
public class SameTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        boolean output1 = isSameTree(p1, q1); // true
        System.out.println("output1 = " + output1);

        TreeNode p2 = new TreeNode(1, new TreeNode(2), new TreeNode());
        TreeNode q2 = new TreeNode(1, new TreeNode(), new TreeNode(2));
        boolean output2 = isSameTree(p2, q2); // false
        System.out.println("output2 = " + output2);

        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        boolean output3 = isSameTree(p3, q3); // false
        System.out.println("output3 = " + output3);
    }
}

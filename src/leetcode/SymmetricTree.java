package leetcode;

// https://leetcode.com/problems/symmetric-tree/
public class SymmetricTree {

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

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }

        return node1.val == node2.val
                && isMirror(node1.left, node2.right)
                && isMirror(node1.right, node2.left);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        boolean output1 = isSymmetric(root1); // true
        System.out.println("output1 = " + output1);

        TreeNode root2 = new TreeNode(1, new TreeNode(2, new TreeNode(), new TreeNode(3)), new TreeNode(2, new TreeNode(), new TreeNode(3)));
        boolean output2 = isSymmetric(root2); // false
        System.out.println("output2 = " + output2);
    }
}

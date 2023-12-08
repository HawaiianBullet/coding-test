package leetcode;

// https://leetcode.com/problems/construct-string-from-binary-tree/
public class ConstructStringFromBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    // https://www.geeksforgeeks.org/binary-tree-string-brackets/
    public static void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) return;

        sb.append(node.val);

        if (node.left == null && node.right == null) return;

        sb.append(("("));
        dfs(node.left, sb);
        sb.append((")"));

        if (node.right != null) {
            sb.append(("("));
            dfs(node.right, sb);
            sb.append((")"));
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        String output1 = tree2str(root1); // "1(2(4))(3)"
        System.out.println("output1 = " + output1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        String output2 = tree2str(root2); // "1(2()(4))(3)"
        System.out.println("output2 = " + output2);
    }
}

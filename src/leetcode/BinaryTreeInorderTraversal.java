package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {

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

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        addInorderTraversalList(root, ans);
        return ans;
    }

    // https://www.geeksforgeeks.org/inorder-traversal-of-binary-tree/
    public static void addInorderTraversalList(TreeNode node, List<Integer> list) {
        if (node == null) return;
        addInorderTraversalList(node.left, list);
        list.add(node.val);
        addInorderTraversalList(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        List<Integer> output1 = inorderTraversal(root1); // [1,3,2]
        System.out.println("output1 = " + output1);

        TreeNode root2 = null;
        List<Integer> output2 = inorderTraversal(root2); // []
        System.out.println("output2 = " + output2);

        TreeNode root3 = new TreeNode(1);
        List<Integer> output3 = inorderTraversal(root3); // [1]
        System.out.println("output3 = " + output3);
    }
}

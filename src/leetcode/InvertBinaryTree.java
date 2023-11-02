package leetcode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {

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

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode tmpNode = root.left;
        root.left = root.right;
        root.right = tmpNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();
            if (temp != null)
                System.out.print(temp.val + " ");

            if (temp == null) {
                if (queue.isEmpty()) break;
                queue.add(null);
                continue;
            }

            /*Enqueue left child */
            if (temp.left != null) {
                queue.add(temp.left);
            }

            /*Enqueue right child */
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode output1 = invertTree(root1); // [4,7,2,9,6,3,1]
        System.out.print("output1 = ");
        printTree(output1);
        System.out.println();

        TreeNode root2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode output2 = invertTree(root2); // [2,3,1]
        System.out.print("output2 = ");
        printTree(output2);
        System.out.println();

        TreeNode root3 = new TreeNode();
        TreeNode output3 = invertTree(root3); // []
        System.out.print("output3 = ");
        printTree(output3);
        System.out.println();
    }
}

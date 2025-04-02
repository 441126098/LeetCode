package binaryTree;

/**
 * 翻转二叉树
 */
public class LeetCode_224 {
    public TreeNode invertTree(TreeNode root) {
        invertNode(root);
        return root;
    }

    public void invertNode(TreeNode node) {
        if (node == null || node.left == null && node.right == null) {
            return ;
        }
        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;
        invertTree(node.left);
        invertTree(node.right);
    }

    public class TreeNode {
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
}

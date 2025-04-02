package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(result, root);
        return result;
    }

    private void inorder(List<Integer> result, TreeNode root) {
        if (null == root) {
            return;
        }
        inorder(result, root.left);
        result.add(root.val);
        inorder(result, root.right);
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

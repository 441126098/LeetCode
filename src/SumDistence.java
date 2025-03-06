public class SumDistence {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        return this.hasPathSum(root, targetSum, 0);
    }

    public boolean hasPathSum(TreeNode root, int targetSum, int cur) {
        if (root.left == null && root.right == null)
            return targetSum == cur + root.val;
        return (root.left != null ? this.hasPathSum(root.left, targetSum, cur + root.val) : false) ||
                (root.right != null ? this.hasPathSum(root.right, targetSum, cur + root.val) : false);
    }
}

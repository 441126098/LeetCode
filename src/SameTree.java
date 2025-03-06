//相同的树

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        else if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode t2 = new TreeNode(1, null, new TreeNode(2));
        System.out.print(new SameTree().isSameTree(t1, t2));
    }
}


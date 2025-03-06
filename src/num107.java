//给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）


import java.util.*;

public class num107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> cur = new LinkedList<>();          //存放当前队列中的节点
        if (root == null)
            return ans;
        else
            cur.offer(root);
        while (cur.size() != 0) {
            List<Integer> tem = new ArrayList<>();          //存放某一层节点的值
            int n = cur.size();
            for (int i = 0; i < n; i++) {                          //将当前层的节点值放入list中，并将下一层的节点值放入队列中
                TreeNode t = cur.poll();
                tem.add(t.val);
                if (t.left != null)
                    cur.add(t.left);
                if (t.right != null)
                    cur.add(t.right);
            }
            ans.add(0, tem);
        }
        return ans;
    }
}

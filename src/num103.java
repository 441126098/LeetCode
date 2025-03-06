//给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class num103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<TreeNode> cur = new LinkedList<>();
        if (root == null) {
            return ans;
        } else {
            cur.add(root);
        }
        boolean ordered = true;
        while (cur.size() != 0) {
            List<Integer> tem = new ArrayList<>();
            int n = cur.size();
            for (int i = 0; i < n; i++) {
                TreeNode now = cur.poll();
                if (now.left != null)
                    cur.add(now.left);
                if (now.right != null)
                    cur.add(now.right);
                if (ordered)
                    tem.add(now.val);
                else
                    tem.add(0, now.val);
            }
            ordered = !ordered;
            ans.add(tem);
        }
        return ans;
    }
}

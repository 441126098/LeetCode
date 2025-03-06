//给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
//叶子节点 是指没有子节点的节点。

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Num113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        LinkedList<TreeNode> stack = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        stack.add(root);
        TreeNode cur = root;
        //int sum = 0;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                //sum += cur.val;
                stack.addFirst(cur);
                cur = cur.left;
            } else {
                cur = stack.removeFirst();
                if (cur.left == null && cur.right == null) {
                    int sum = 0;
                    List<Integer> tem = new ArrayList<>();
                    for (int i = 0; i < stack.size(); i++) {
                        sum += stack.get(i).val;
                        tem.add(0, stack.get(i).val);
                    }
                    tem.add(0, cur.val);
                    sum += cur.val;
                    if (sum == targetSum)
                        ans.add(tem);
                } else
                    cur = cur.right;
            }
        }
        return ans;
    }

}

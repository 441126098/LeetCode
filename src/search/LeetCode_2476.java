package search;

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class LeetCode_2476 {

    // todo
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>(queries.size());
        for (int i=0; i<queries.size(); i++) {
            List<Integer> a = new ArrayList<>();
            a.add(Integer.MIN_VALUE);
            a.add(Integer.MAX_VALUE);
            result.add(a);
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (null != curr.left)
                queue.add(curr.left);
            if (null != curr.right)
                queue.add(curr.right);
            int val = curr.val;
            for (int i=0;i<queries.size();i++) {
                List<Integer> integers = result.get(i);
                if (integers.get(0) < val && val <= queries.get(i)) {
                    integers.set(0, val);
                }
                if (integers.get(1) > val && val >= queries.get(i)) {
                    integers.set(1,val);
                }
            }
        }
        for (int i=0; i<queries.size(); i++) {
            List<Integer> a = result.get(i);
            if (a.get(0) == Integer.MIN_VALUE) {
                a.set(0, -1);
            }
            if (a.get(1) == Integer.MAX_VALUE) {
                a.set(1, -1);
            }
        }
        return result;
    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
}

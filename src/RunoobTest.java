import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class RunoobTest {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<TreeNode> cur = new LinkedList<>();
        LinkedList<TreeNode> next = new LinkedList<>();
        if (root != null) {
            cur.add(root);
        } else
            return ans;
        while (cur.size() != 0) {
            List<Integer> tem = new ArrayList<>();
            for (int i = 0; i < cur.size(); i++) {
                TreeNode h = cur.get(i);
                tem.add(h.val);
                if (h.left != null)
                    next.add(h.left);
                if (h.right != null)
                    next.add(h.right);

            }
            ans.add(tem);
            cur = next;
            next = new LinkedList<>();
        }
        return ans;
    }
}



import java.util.ArrayList;
import java.util.List;

public class Subben {
    public static List<List<Integer>> enumerate(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (Integer n : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSub = new ArrayList<Integer>(res.get(i));
                newSub.add(n);
                res.add(newSub);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Subben.enumerate(new int[]{1, 2, 3, 4, 5});
    }
}

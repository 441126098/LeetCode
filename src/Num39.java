
import java.util.ArrayList;
import java.util.List;

public class Num39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> temp = new ArrayList<>();
        combinationSum(candidates, target, 0, ans, temp, 0);
        return ans;
    }

    public void combinationSum(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> temp, int sum) {

        if (sum > target)
            return;
        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i =index;i< candidates.length; i++) {
            sum += candidates[i];
            temp.add(candidates[i]);
            combinationSum(candidates,target, i, ans, temp, sum);
            sum -= candidates[i];
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int []candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> a = new Num39().combinationSum(candidates, target);
        System.out.println(a);
    }

}

/*给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。*/


import java.util.ArrayList;
import java.util.List;

public class Num78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for (int i=0;i<nums.length;i++) {
            int size = ans.size();
            for (int j=0;j<size;j++) {
                List<Integer> temp = new ArrayList<>(ans.get(j));
                temp.add(nums[i]);
                ans.add(temp);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3};
        new Num78().subsets(test);
    }
}

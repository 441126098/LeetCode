import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumToZero {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length == 0)
            return ans;
        for (int i = 0; i < nums.length - 2 && nums[i] + nums[i + 1] + nums[i + 2] <= 0; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            int L = i + 1, R = nums.length - 1;
            while (L < R) {
                if (nums[i] + nums[L] + nums[R] == 0) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[L]);
                    temp.add(nums[R]);
                    ans.add(temp);
                    while (nums[L] == nums[L + 1])
                        L++;
                    while (nums[R] == nums[R - 1])
                        R--;
                    L++;
                    R--;
                } else if (nums[i] + nums[L] + nums[R] < 0)
                    L += 1;
                else
                    R -= 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(new SumToZero().threeSum(new int[]{-1, 0, 1, 2, -1, -4}).toString());
    }
}

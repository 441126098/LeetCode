//下一个更大元素 II
//单调栈

import java.util.Arrays;
import java.util.Stack;

public class GreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 2 * nums.length; i++) {
            while (!s.isEmpty() && nums[i % nums.length] > nums[s.peek() % nums.length]) {
                ans[s.pop() % nums.length] = nums[i % nums.length];
            }
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int test[] = {1, 2, 1};
        new GreaterElements().nextGreaterElements(test);
    }
}

import java.util.HashSet;
import java.util.TreeMap;

public class SlideWindow {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        int res = 0, left = 0, right = 0;
        while (right < nums.length) {
            m.put(nums[right], m.getOrDefault(nums[right], 0) + 1);
            while (m.lastKey() - m.firstKey() > limit) {
                m.put(nums[left], m.get(nums[left]) - 1);
                if (m.get(nums[left]) == 0)
                    m.remove(nums[left]);
                left++;
            }
            res = Math.max(res, right - left);
            right++;
        }

        return res;
    }

    public static void main(String[] args) {

    }
}

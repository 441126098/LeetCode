import java.util.HashMap;
import java.util.Map;

public class Degree {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        Map<Integer, Integer> length = new HashMap<Integer, Integer>();
        Map<Integer, Integer> positon = new HashMap<Integer, Integer>();
        int max = 0;
        int maxkey = 0;
        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
                length.put(nums[i], i - positon.get(nums[i]) + 1);
                if (frequency.get(nums[i]) > max) {
                    max = frequency.get(nums[i]);
                    maxkey = nums[i];
                }
                if (frequency.get(nums[i]) == max && length.get(nums[i]) < length.get(maxkey))
                    maxkey = nums[i];
            } else {
                positon.put(nums[i], i);
                frequency.put(nums[i], 1);
                length.put(nums[i], 1);
                if (frequency.get(nums[i]) > max) {
                    max = 1;
                    maxkey = nums[i];
                }
            }
        }
        return length.get(maxkey);
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 2, 3, 1};
        System.out.print(new Degree().findShortestSubArray(test));
    }
}

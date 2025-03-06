package slideWindow;

public class Main1 {
    /**
     * 长度最小的子数组
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0,right = 0,sum = 0;
        int []res = new int[0];
        
        while (right < nums.length) {
            sum += nums[right];
            right ++ ;
            while (sum >= target) {
                // 截取窗口并复制给res
                if (res.length ==0 || res.length > right - left) {
                    res = new int[right - left]; // 创建目标数组，长度与源数组相同

                    System.arraycopy(nums, left, res, 0, right - left);
                }
                sum -= nums[left];
                left ++ ;
            }
        }
        return res.length;
    }

    public static void main(String[] args) {
        int []nums = {2,3,1,2,4,3};
        int target = 7;
        Main1 main1 = new Main1();
        int i = main1.minSubArrayLen(target, nums);
        System.out.println(i);
    }
}

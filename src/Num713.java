/*给你一个整数数组 nums 和一个整数 k ，请你返回子数组内所有元素的乘积严格小于 k 的连续子数组的数目。*/

public class Num713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k)
                count++;
            int j = 1;
            int temp = nums[i];
            while (i+j < nums.length && temp * nums[i + j] < k ) {
                temp = temp * nums[i + j];
                j++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int test[] = {10,5,2,6};
        new Num713().numSubarrayProductLessThanK(test, 100);
    }
}

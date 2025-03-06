public class colorclasscification {
    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length - 1;
        for (int i = 0; i < two + 1; i++) {
            int tem;
            if (nums[i] == 0) {
                tem = nums[zero];
                nums[zero++] = nums[i];
                nums[i] = tem;
            }
            if (nums[i] == 2) {
                tem = nums[two];
                nums[two--] = nums[i];
                nums[i] = tem;
                i--;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new colorclasscification().sortColors(nums);
    }
}

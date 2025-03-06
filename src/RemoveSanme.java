public class RemoveSanme {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i])
                ans++;
            nums[ans] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        //int []test = {0,0,1,1,1,2,2,3,3,4};
        int[] test = {1, 1, 2};
        System.out.println(new RemoveSanme().removeDuplicates(test));
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + "  ");
        }
    }
}


/*给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。

        数组中的每个元素代表你在该位置可以跳跃的最大长度。

        判断你是否能够到达最后一个下标。*/
public class Num55 {
    public boolean canJump(int[] nums) {
        int[] reach = new int[nums.length];
        reach[0] = 1;
        int i = 0;
        while (i < nums.length && reach[i] == 1){
            for (int j=1;j<=nums[i] && i+j < nums.length;j++){
                reach[i+j] = 1;
            }
            i++;
        }
        return reach[nums.length-1] == 1;
    }

    public static void main(String[] args) {
        int test[] = {2,3,1,1,4};
        new Num55().canJump(test);
    }
}

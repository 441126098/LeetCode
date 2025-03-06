//给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
//
//数组中的每个元素代表你在该位置可以跳跃的最大长度。
//
//你的目标是使用最少的跳跃次数到达数组的最后一个位置。
//
//假设你总是可以到达数组的最后一个位置。


import java.lang.reflect.Array;
import java.util.Arrays;

public class Num45 {

    public int jump(int[] nums) {
        int []res = new int[nums.length];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[0] = 0;
        for (int i=0;i<nums.length;i++){
            for (int j=1;j<=nums[i]&&i+j<nums.length;j++){
                res[i+j] = Math.min(res[i]+1,res[i+j]);
                System.out.println((i+j)+":"+ res[i+j]);
            }
        }
        return res[nums.length-1];
    }

    public static void main(String[] args) {
        int []test = {2,3,1,1,4};
        System.out.print(new Num45().jump(test));
    }

}

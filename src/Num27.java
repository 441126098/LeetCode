//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//
//        不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//
//        元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/remove-element
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


public class Num27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==val){
                count += 1;
            }
            else
                nums[i-count] = nums[i];
        }
        Integer a = 3;
        return nums.length-count;
    }

}

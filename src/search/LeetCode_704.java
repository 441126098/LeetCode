package search;

//给定一个 n 个元素有序的（升序
// 整型数组 nums 和一个目标值 target  ，
// 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
//

public class LeetCode_704 {

    public static void main(String[] args) {
        int []a = new int[]{-1,0,3,5,9,12};
        new LeetCode_704().search(a, 8);
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int middle = (left + right)/2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle-1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            }
        }
        return -1;
    }
}
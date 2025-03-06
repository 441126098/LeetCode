//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置


public class Num35 {

    public int searchInsert(int[] nums, int target) {
        /*for (int i=0;i<nums.length;i++){
            if (nums[i] >= target)
                return i;
        }*/
        int begin =0,end=nums.length-1,mid=(begin+end)/2;
        for (;begin<=end;mid=(begin+end)/2){
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target){
                end = mid -1;
            }
            if (nums[mid] < target){
                begin = mid + 1;
            }

        }
        if (nums[mid] > target)
            return mid;
        else
            return mid + 1;
    }
}

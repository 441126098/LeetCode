package dynamicProgramming;

public class LeetCode_45 {

    public static void main(String[] args) {
        int a[] = new int[]{2,3,0,1,4};
        new LeetCode_45().jump(a);
    }
    public int jump(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            for (int j=1;j<=nums[i]&&j+i<nums.length;j++) {
                if (temp[i+j] ==0 || temp[i+j] > temp[i] + 1) {
                    temp[i+j] = temp[i] + 1;
                }
            }
        }
        return temp[nums.length-1];
    }
}

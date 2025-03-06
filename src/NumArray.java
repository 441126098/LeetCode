//303 区域和检索 - 数组不可变

public class NumArray {
    int[] num;

    public NumArray(int[] nums) {
        this.num = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (; i < j + 1; i++) {
            sum += num[i];
        }
        return sum;
    }
}

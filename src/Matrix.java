public class Matrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        /*if (nums==null)
            return null;*/
        if (nums.length * nums[0].length != r * c)
            return nums;
        int[][] ans = new int[r][c];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                ans[count / c][count % c] = nums[i][j];
                count++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    }
}

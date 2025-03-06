package dynamicProgramming;

import java.util.concurrent.LinkedTransferQueue;

/**
 * 最小路径和
 */
public class main1 {
    public int minPathSum(int[][] grid) {
        int[][] ans = new int[grid.length][grid[0].length];
        ans[0][0] = grid[0][0];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                int temp = Integer.MAX_VALUE;
                if (i > 0)
                    temp = ans[i-1][j];
                if (j >0)
                     temp = Math.min(temp,ans[i][j-1]);
                if (i ==0 && j==0)
                    ans[i][j] = grid[i][j];
                else
                    ans[i][j] += temp + grid[i][j];
            }
        }
        return ans[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new main1().minPathSum(grid));
    }
}

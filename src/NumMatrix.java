//304 二维区域和检索 矩阵不可变

public class NumMatrix {
    int[][] value;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return;
        value = new int[matrix.length][matrix[0].length];
        value[0][0] = matrix[0][0];
        for (int i = 1; i < matrix[0].length; i++) {
            value[0][i] = value[0][i - 1] + matrix[0][i];
        }
        for (int j = 1; j < matrix.length; j++) {
            value[j][0] = value[j - 1][0] + matrix[j][0];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                value[i][j] = matrix[i][j] + value[i - 1][j] + value[i][j - 1] - value[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        /*int sum=0;
        for (int i=row1;i<=row2;i++){
            for (int j=col1;j<=col2;j++){
                sum += value[i][j];
            }
        }*/
        int left = 0, upright = 0, bonus = 0;
        if (row1 > 0)
            upright = value[row1 - 1][col2];
        if (col1 > 0)
            left = value[row2][col1 - 1];
        if (row1 > 0 && col1 > 0)
            bonus = value[row1 - 1][col1 - 1];
        return value[row2][col2] - left - upright + bonus;
    }

    public static void main(String[] args) {
        int[][] test = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        System.out.print(new NumMatrix(test).sumRegion(2, 1, 4, 3));
    }
}

public class Touplt {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null)
            return true;
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (!(matrix[i][j] == matrix[i - 1][j - 1]))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(new Touplt().isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
    }
}

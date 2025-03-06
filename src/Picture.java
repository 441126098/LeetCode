public class Picture {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int half;
            if (A[i].length % 2 == 0)
                half = A[i].length / 2;
            else
                half = A[i].length / 2 + 1;
            for (int j = 0; j < half; j++) {
                int temp = 1 ^ A[i][j];
                A[i][j] = 1 ^ A[i][A[i].length - 1 - j];
                A[i][A[i].length - 1 - j] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        A = new Picture().flipAndInvertImage(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++)
                System.out.print(A[i][j]);
            System.out.println();
        }
    }
}

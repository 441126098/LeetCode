//896. 单调数列
// 2021.2.28

public class Mnotonous {
    public boolean isMonotonic(int[] A) {
        int i = 0;
        while (A[i] == A[i + 1] && i + 1 < A.length)
            i++;
        if (A[i + 1] > A[i])
            while (i + 1 < A.length && A[i + 1] >= A[i])
                i++;
        else
            while (i + 1 < A.length && A[i + 1] <= A[i])
                i++;
        if (i == A.length - 1)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 2, 3};
        System.out.print(new Mnotonous().isMonotonic(test));
    }
}

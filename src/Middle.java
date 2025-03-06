public class Middle {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int current = 0, pre = 0;
        double ans = 0;
        int target = (nums1.length + nums2.length) / 2;
        for (int count = 0; count <= target; count++) {
            int num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE;
            if (i < nums1.length)
                num1 = nums1[i];
            if (j < nums2.length)
                num2 = nums2[j];
            pre = current;
            if (num1 <= num2) {
                current = num1;
                i++;
            } else {
                current = nums2[j];
                j++;
            }
        }
        if ((nums1.length + nums2.length) % 2 != 0) {
            ans = current;
        } else {
            ans = (double) (current + pre) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(new Middle().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}

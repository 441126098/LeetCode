package array;

public class LeetCode_57 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return null;
        }
        boolean[] isMerge = new boolean[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < i; j++) {
                if (isMerge[j]) {
                    continue;
                }
                // 判断区间是否重叠
                if (isBetween(intervals[i][0], intervals[j]) || isBetween(intervals[i][1], intervals[j])
                || isBetween(intervals[j][0], intervals[i]) || isBetween(intervals[j][1], intervals[i])) {
                    // 合并区间
                    merge(intervals[i], intervals[j]);
                    isMerge[j] = true;
                }
            }
        }
        int resultLength =0;
        for (int i=0;i< intervals.length; i++) {
            if (!isMerge[i]) {
                resultLength ++;
            }
        }
        int [][]result = new int[resultLength][2];
        int index =0;
        for (int i = 0; i < intervals.length; i++) {
            if (!isMerge[i]) {
                result[index] = intervals[i];
                index ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{2, 3}, {4, 5}, {1, 10}};
        new LeetCode_57().merge(intervals);
    }

    boolean isBetween(int num, int[] range) {
        return num >= range[0] && num <= range[1];
    }

    void merge(int[] range1, int[] range2) {
        if (range1[0] > range2[0]) {
            range1[0] = range2[0];
        }
        if (range1[1] < range2[1]) {
            range1[1] = range2[1];
        }
    }
}

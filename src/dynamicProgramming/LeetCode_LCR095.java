package dynamicProgramming;

//
//给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。如果不存在 公共子序列 ，返回 0 。
//
//一个字符串的 子序列 是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。
//
//例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。
//两个字符串的 公共子序列 是这两个字符串所共同拥有的子序列。
public class LeetCode_LCR095 {

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int res = longestCommonSubsequence(text1, text2);
        System.out.println(res);
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] a = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            for (int j=0;j < text2.length();j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    if (i-1 < 0|| j-1<0) {
                        a[i][j] = 1;
                    } else {
                        a[i][j] = a[i-1][j-1] + 1;
                    }
                } else {
                    int num1 =0;
                    int num2 =0;
                    if (i > 0) {
                        num1 = a[i-1][j];
                    }
                    if (j > 0) {
                        num2 = a[i][j-1];
                    }
                    a[i][j] = Math.max(num1, num2);
                }
            }
        }
        return a[text1.length()-1][text2.length()-1];
    }
}

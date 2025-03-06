import java.util.Map;

public class Palindrome {
    public String longestPalindrome(String s) {
        boolean[][] squre = new boolean[s.length()][s.length()];
        for (int i = s.length() - 2; i > -1; i--) {
            for (int j = s.length() - 1; j > i; j--) {
                boolean tem = s.charAt(i) == s.charAt(j);
                if (tem && j - i < 3) {
                    squre[i][j] = true;
                } else if (tem && j - i >= 3) {
                    squre[i][j] = squre[i + 1][j - 1];
                } else if (s.charAt(i) != s.charAt(j))
                    squre[i][j] = false;
            }
        }
        int i = 0, j = 0;
        for (; i < squre.length - 1; i++) {
            for (j = 0; j < i + 1; j++) {
                //System.out.print(j+":"+(s.length()-i+j-1));
                if (squre[j][s.length() - i + j - 1])
                    return s.substring(j, s.length() - i + j);
            }
        }
        if (s.length() == 0)
            return "";
        else
            return "" + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.print(new Palindrome().longestPalindrome("babad"));
    }
}

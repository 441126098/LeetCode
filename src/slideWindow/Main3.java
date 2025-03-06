package slideWindow;

/**
 * 最长回文字串
 */
public class Main3 {

//    首先往左寻找与当期位置相同的字符，直到遇到不相等为止。
//    然后往右寻找与当期位置相同的字符，直到遇到不相等为止。
//    最后左右双向扩散，直到左和右不相等。
    public String longestPalindrome(String s) {
        int max = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            int right = i,left = i;
            // 窗口向左扩大，直到遇到不相等
            while (left>=0 && s.charAt(i) == s.charAt(left)){
                left --;
            }
            // 窗口向右扩大，直到不相等
            while (right < s.length() && s.charAt(right) == s.charAt(i)){
                right ++;
            }
            // 窗口同时向两边扩大，直到首尾不相等
            while (right < s.length() && left >= 0 && s.charAt(right) == s.charAt(left)){
                right ++;
                left --;
            }
            if (right - left - 1 > max){
                max = right - left - 1;
                res = s.substring(left + 1,right);
            }
        }
        return res;
    }
    // 是否回文
    public boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        for (; left < right; left++, right--){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
        }
        return true;
    }
}

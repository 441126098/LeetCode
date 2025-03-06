package slideWindow;

/**
 * todo 424 替换后的最长重复字符
 */
public class Main2 {

    /**
     * 替换后的最长重复字符
     *
     * @param s
     * @param k
     * @return
     */
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int max = k;
        while (right < s.length()) {
            right ++;
            while (right - left > max) {

                left ++;
            }
        }
        return k;
    }
}

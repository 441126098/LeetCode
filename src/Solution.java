
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int countMax = 0;
        int begin = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = s.substring(begin, i).indexOf(s.charAt(i));
            if (temp == -1) {
                count++;
                if (count > countMax)
                    countMax = count;
            } else {
                if (count > countMax)
                    countMax = count;
                begin += temp + 1;
                count = i - begin;
                i--;
            }
        }
        return countMax;
    }

    public static void main(String[] args) {
        System.out.print(new Solution().lengthOfLongestSubstring("dvdf"));
    }
}

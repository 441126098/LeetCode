package dynamicProgramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_100 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // 空字符串可以被拆分

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
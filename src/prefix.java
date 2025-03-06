import javax.swing.plaf.IconUIResource;
import java.net.SocketTimeoutException;

public class prefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length == 0)
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            int j = 1;
            for (; j < strs.length; j++) {
                if (i < strs[j].length() && strs[j].charAt(i) == strs[0].charAt(i))
                    continue;
                else
                    break;
            }
            if (j == strs.length)
                ans += strs[0].charAt(i);
            else
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(new prefix().longestCommonPrefix(new String[]{}));
    }
}

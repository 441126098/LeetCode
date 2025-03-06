public class Regex {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        while (i < s.length() && j < p.length()) {
            if (s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else if (p.charAt(j) == '.') {
                i++;
                j++;
            } else if (j + 2 < p.length() && p.charAt(j + 1) == '*') { //*重复字符数为0的情况
                if (s.charAt(i) == p.charAt(j + 2)) {
                    j += 3;
                    i++;
                } else
                    return false;
            } else if (p.charAt(j) == '*') {
                while (i < s.length() && s.charAt(i) == s.charAt(i - 1))
                    i++;
                if (p.charAt(j - 1) == '.') {
                    if (p.length() == j + 1)
                        return true;
                    else {
                        if (s.substring(i, s.length()).indexOf(p.charAt(j + 1)) == -1)
                            return false;
                        else
                            i = s.substring(i, s.length()).indexOf(p.charAt(j + 1));
                    }
                }
                j++;
            } else
                return false;
        }
        if (i != s.length() || j != p.length())
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.print(new Regex().isMatch("mississippi", "mis*is*p*."));
    }
}

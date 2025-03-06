import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class RepeatSub {
    public int longestSubstring(String s, int k) {
        if (s.length() < k)
            return 0;
        HashMap<Character, ArrayList<Integer>> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                ArrayList<Integer> tem = m.get(s.charAt(i));
                tem.add(i);
                m.put(s.charAt(i), tem);
            } else {
                ArrayList<Integer> tem = new ArrayList<>();
                tem.add(i);
                m.put(s.charAt(i), tem);
            }
        }
        ArrayList<Integer> fin = new ArrayList<>();
        for (ArrayList<Integer> list : m.values()) {
            if (list.size() < k)
                fin.addAll(list);
        }
        Collections.sort(fin);
        if (fin.size() == 0)
            return s.length();
        else {
            int res = this.longestSubstring(s.substring(0, fin.get(0)), k);
            for (int i = 1; i < fin.size(); i++) {
                res = Math.max(res, this.longestSubstring(s.substring(fin.get(i - 1) + 1, fin.get(i)), k));
            }
            res = Math.max(res, this.longestSubstring(s.substring(fin.get(fin.size() - 1) + 1), k));
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.print(new RepeatSub().longestSubstring("bbaaacbd", 3));
    }
}

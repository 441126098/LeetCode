import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Puzzle {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> res = new ArrayList<Integer>();
        for (String puzzle : puzzles) {
            HashMap<Character, Integer> puz = new HashMap<Character, Integer>();
            for (int i = 0; i < puzzle.length(); i++) {
                puz.put(puzzle.charAt(i), i);
            }
            int ans = 0;
            for (String word : words) {
                boolean first = false;
                int i = 0;
                for (; i < word.length(); i++) {
                    int temp = puzzle.indexOf(word.charAt(i));
                    if (puz.containsKey(word.charAt(i))) {
                        if (puz.get(word.charAt(i)) == 0)
                            first = true;
                    } else
                        break;
                }
                if (i == word.length() && first == true)
                    ans += 1;
            }
            res.add(ans);
        }
        return res;
    }
}

import java.util.Stack;

public class RemoveDup {
    public String removeDuplicates(String S) {
        String ans = "";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (s.isEmpty() || S.charAt(i) != s.peek())
                s.push(S.charAt(i));
            else
                s.pop();
        }
        while (!s.isEmpty())
            ans = ans + s.pop();
        return ans;
    }

    public static void main(String[] args) {

    }
}

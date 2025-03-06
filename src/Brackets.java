import java.util.Stack;

public class Brackets {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.pop() == '(') break;
                    else return false;
                case ']':
                    if (!stack.isEmpty() && stack.pop() == '[') break;
                    else return false;
                case '}':
                    if (!stack.isEmpty() && stack.pop() == '{') break;
                    else return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.print(new Brackets().isValid("()"));
    }
}

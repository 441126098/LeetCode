public class StringtoInteger {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;
        int i = 0;
        boolean minus = false;
        if (s.charAt(0) == '-') {
            minus = true;
            i = 1;
        }
        char[] num = new char[s.length()];
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            num[i] = s.charAt(i);
            i++;
        }
        String temp = String.valueOf(num);
        temp = temp.trim();
        int result = 0;
        try {
            result = Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            if (temp.isEmpty())
                return result;
            else if (minus)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
        if (minus)
            result = -1 * result;
        return result;
    }

    public static void main(String[] args) {
        StringtoInteger test = new StringtoInteger();
        System.out.print(test.myAtoi("words and 987"));
    }
}
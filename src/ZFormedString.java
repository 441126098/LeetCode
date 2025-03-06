public class ZFormedString {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder("");
        int temp;
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            index = i;
            for (; index < s.length(); index = index + 2 * (numRows - 1)) {
                result.append(s.charAt(index));
                temp = index + 2 * (numRows - 1) - 2 * i;
                if (i != 0 && i != numRows - 1) {
                    if (temp >= s.length())
                        break;
                    else {
                        result.append(s.charAt(temp));
                    }
                }
            }
        }
        return result.toString();
        //return result.toString();
    }

    public static void main(String[] args) {
        String s = "A";
        ZFormedString te = new ZFormedString();
        System.out.print(te.convert(s, 1));
    }
}

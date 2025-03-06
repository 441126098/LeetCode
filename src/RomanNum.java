public class RomanNum {
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                        ans += 4;
                        i++;
                    } else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                        ans += 9;
                        i++;
                    } else
                        ans += 1;
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                        ans += 40;
                        i++;
                    } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                        ans += 90;
                        i++;
                    } else
                        ans += 10;
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                        ans += 400;
                        i++;
                    } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                        ans += 900;
                        i++;
                    } else
                        ans += 100;
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(new RomanNum().romanToInt("DCXXI"));
    }
}

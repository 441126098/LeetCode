public class Num29 {
    public int divide(int dividend, int divisor) {
        int res = 0;
        boolean ifPos = true;
        if (dividend>0) {
            dividend = 0-dividend;

        }
        else
            ifPos = !ifPos;
        if (divisor>0){
            divisor = 0-divisor;
        }
        else
            ifPos = !ifPos;
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        while (dividend<=divisor) {
            res ++;
            dividend -= divisor;
        }
        if (ifPos)
            return res;
        else
            return 0-res;
    }

    public static void main(String[] args) {
        System.out.println(new Num29().divide(-2147483648,-1));
    }
}

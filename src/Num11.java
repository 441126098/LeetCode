import java.util.HashMap;
import java.util.Map;

public class Num11 {

    public int maxArea(int[] height) {
        int res = 0 ;
        int a=0;
        int b=0;
        if (height.length >1) {
            int temp = height[a]>height[b]?height[b]:height[a];
            res = temp * (height.length-1);
        }else return res;

        while (a+b < height.length) {
            int tempa = height[a];
            int tempb = height[b];
            int temp = tempa>tempb?tempb:tempa;

            res = temp * (height.length -1 -b -a);
            if (height[a+1] > height[a]) {
                a++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String s = "[]";
    }
}

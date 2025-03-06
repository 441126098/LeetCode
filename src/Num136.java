import java.util.HashMap;
import java.util.Map;

public class Num136 {

    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int num:nums){
            if (m.containsKey(num))
                m.remove(num);
            else
                m.put(num,1);
        }
        Integer[]res=new Integer[1];
        return m.keySet().toArray(res)[0];
    }

    public static void main(String[] args) {
        int []test = {4,1,2,1,2};
        System.out.print(new Num136().singleNumber(test));
    }
}

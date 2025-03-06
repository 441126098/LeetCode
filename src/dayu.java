import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class dayu {

    int zeroNums(int num){
        String str = String.valueOf(num);
        int res = 0;
        while (str.indexOf("0")>=0){
            res++;
            str = str.substring(str.indexOf("0")+1);
        }
        return res;
    }


    void prime(int n){
        int i = 2;
        for (;i<n;i++){
            if (isPrime(i))
                System.out.println(i);
        }
    }

    boolean isPrime(int n){
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%2==0)
                return false;
        }
        return true;
    }


    Set<Integer> randomNum(int N, int M, int K){
        Map<Integer,Integer> res = new HashMap<Integer,Integer>();
        for (int i=0;i<K;i++){
            int num = (int)Math.random()*(M-N) + N;
            if (res.containsKey(num))
                i--;
            else
                res.put(num,0);
        }
        return res.keySet();
    }

    void sort(int a[], int n)
    {
        int begin=0,end=n-1;
        while (begin<end){
            while (a[begin]%2==1)
                begin++;
            while (a[end]%2==0)
                end--;
            int temp = a[begin];
            a[begin] = a[end];
            a[end] = temp;
        }
    }



    public static void main(String[] args) {
        int i=100205230;
        System.out.println(new dayu().zeroNums(i));
    }
}





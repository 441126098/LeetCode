

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = Integer.parseInt(in.nextLine());
        List<Integer> scores = new ArrayList();
        String input = in.nextLine();
        String[] a = input.split(",");
        for (String b:a) {
            scores.add(Integer.parseInt(b));
        }

        for (int i=0;i<scores.size()-m+1;i++){
            int min = Integer.MAX_VALUE;
            for (int j=0;j<m&& i+j < scores.size();j++){
                if (scores.get(i+j) < min)
                    min = scores.get(i+j);
            }
            System.out.println(min);
        }
        /*int secMin = Integer.MAX_VALUE;
        Map numbers = new HashMap<>();
        for (int i=0;i<m && i< scores.size();i++) {
            numbers.put(scores.get(i), (numbers.containsKey(scores.get(i)) ? numbers.get(scores.get(i)):0) +1);
            if (scores.get(i) < min) {
                secMin = min;
                min = scores.get(i);

            }
        }*/

        /*for (int i=0;i<m && i< scores.size();i++) {
            if (scores.get(i) < min) {
                min = scores.get(i);

            }
        }
        System.out.println(min);
        for (int j=m;j<scores.size();j++) {
            if (scores.get(j-m) == min)
                min = secMin;

        }*/
    }
}

/*bein -4
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int a = 1, b = 1, curr=1;
        for (int i = 2; i < n; i++) {
            curr=(a+b)%10007;
            //a = b%10007;
            //b = curr%10007;
            a = b;
            b = curr;
        }
        System.out.println(curr+"");*/
        /*begin -1
        Scanner input = new Scanner(System.in);
        int a =input.nextInt(),b=input.nextInt();
        System.out.print((a+b)+"");
         */
        /*System.out.print(Integer.MAX_VALUE+"");
        System.out.print(Integer.MIN_VALUE+"");*/
        /*beign -2
        Scanner input = new Scanner(System.in);
        long n =input.nextLong();
        System.out.print((1+n)*n/2+"");
         */
/*十进制转八进制
        String num[] = new String[n];
        for(int i=0;i<n;i++) {
            num[i] = input.next();
        }
        for(int i=0;i<n;i++){
            StringBuilder binay = new StringBuilder("");
            StringBuilder result=new StringBuilder("");
            for (int j=0;j<num[i].length();j++) {
                String temp = Integer.toBinaryString(Integer.parseInt(num[i].substring(j, j + 1), 16));
                while (temp.length() < 4) {
                    temp = '0' + temp;
                }
                binay.append(temp);
            }
            while (binay.length() % 3 != 0) {
                binay.insert(0,'0');
            }
            for (int k=0; k < binay.length(); k += 3) {
                result.append(Integer.toOctalString(Integer.parseInt(binay.substring(k, k + 3), 2)));
            }
            if(result.charAt(0)=='0') {
                result.deleteCharAt(0);
            }
            System.out.println(result + "");

 */
/* 输出字符数组
char[][] result = new char[n][m];
        for (int i=0;i<n;i++){
        for (int j=0;j<m;j++){
        result[i][j] = (char)('A'+Math.abs(j-i));
        }
        }
        for (int i=0;i<n;i++){
        for (int j=0;j<m;j++){
        System.out.print(result[i][j]);
        }
        System.out.print("\n");
        }*/
/*查找字符位置
Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []list = new int[n];
        for (int i=0;i<n;i++){
            list[i] = input.nextInt();
        }
        int target = input.nextInt();
        int count = 1;
        int j = 0;
        while (j<list.length&&list[j]!=target){
            count += 1;
            j++;
        }
        if(j==list.length)
            count = -1;
        System.out.print(count);
    }
 */


/*
* int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        int m = input.nextInt();
        for (int j = 0; j < m; j++) {
            int begin = input.nextInt();
            int stop = input.nextInt();
            int index = input.nextInt();
            int[] temp = new int[stop - begin + 1];
            for (int k = 0; k < temp.length; k++) {
                temp[k] = list[begin - 1 + k];
            }
            Arrays.sort(temp);
            System.out.println(temp[temp.length - index]);
        }*/
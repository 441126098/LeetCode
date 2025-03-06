/*
* 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。

candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。 

对于给定的输入，保证和为 target 的不同组合数少于 150 个。
* */

import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String [] passwords = input.split(" ");
        Map map = new HashMap<>();
        for (String password:passwords) {
            map.put(password,0);
        }
        String res = "";
        for (String password:passwords) {
            String temp = password;
            while (temp.length() > 1) {
                if (map.containsKey(temp.substring(0,temp.length()-1))) {
                    temp = temp.substring(0,temp.length()-1);
                }
                else
                    break;
            }
            if (temp.length() == 1 && map.containsKey(temp)) {
                if (biggerThan(password, res))
                    res = password;
            }

        }
        if (res.length() == 1)
            res = "";
        System.out.println(res);
    }
    public static boolean biggerThan (String a, String b) {
        if (a.length() > b.length())
            return true;
        if (a.length() == b.length() ) {
            for (int i=0;i<a.length();i++){
                if (a.charAt(i) < b.charAt(i))
                    return false;
            }
            return true;
        }
        return false;
    }
}

/*Scanner in = new Scanner(System.in);
        String lineOne = "";
        String lineTwo = "";
        String lineThree = "";
        lineOne = in.nextLine();
        lineTwo = in.nextLine();
        lineThree = in.nextLine();
        int cache = Integer.parseInt(lineOne);
        List file = new ArrayList<Integer>();
        List size = new ArrayList<Integer>();
        String [] files = lineTwo.split(" ");
        String [] sizes = lineThree.split(" ");
        for (int i =0;i<files.length;i++) {
            file.add(Integer.parseInt(files[i]));
            size.add(Integer.parseInt(sizes[i]));
        }
        Map map = new HashMap();

        for (int j=0;j<file.size();j++) {
            int gold = (map.get(file.get(j)) == null ?0 : (int)map.get(file.get(j)) )+ (int)size.get(j);
            if (gold > (int)size.get(j) + cache) {
                gold = (int)size.get(j) + cache;
            }
            map.put(file.get(j), gold);
        }
        Iterator iterator = map.values().iterator();
        int res = 0;
        while (iterator.hasNext()) {
            res += (int) iterator.next();
        }
        System.out.println(res);*/
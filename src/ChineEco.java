import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ChineEco {
    private int count = 0;
    int Permutations(String str){
        ConcurrentHashMap<Character,Integer> m = new ConcurrentHashMap<>();
        for (int i=0;i<str.length();i++){
            if (m.containsKey(str.charAt(i)))
                m.put(str.charAt(i),m.get(str.charAt(i))+1);
            else
                m.put(str.charAt(i),1);
        }
        this.dfs(str,m,0);
        return count;
    }

    void dfs(String str,ConcurrentHashMap<Character,Integer> m,int index){
        if (index == str.length())
            count++;
        else {
            for (Character c :m.keySet()){
                if (m.get(c)>1)
                    m.put(c,m.get(c)-1);
                else
                    m.remove(c);
                dfs(str,m,index+1);
                if (m.containsKey(c))
                    m.put(c,m.get(c)+1);
                else
                    m.put(c,1);
            }
        }
    }

    public static void main(String[] args) {
        /*String test = "AABB";
        System.out.println(new ChineEco().Permutations(test));*/
        HashMap<String,Integer> m = new HashMap<String,Integer>();
        m.put("sfe",1);
    }

}

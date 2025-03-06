import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num17 {
    public List<String> letterCombinations(String digits) {
        List l = new ArrayList();

        HashMap<Character,String> m = new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");
        if ("".equals(digits))
            return l;
        this.dfs(0,digits,new StringBuilder(),m,l);
        return l;
    }

    void dfs(int index,String digits,StringBuilder tem,HashMap<Character,String> m,List l){
        if (index == digits.length())
            l.add(tem.toString());
        else {
            String can = m.get(digits.charAt(index));
            for (int i=0;i<can.length();i++){
                tem.append(can.charAt(i));
                dfs(index+1,digits,tem,m,l);
                tem.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        new Num17().letterCombinations(digits);
    }

}
//dfs
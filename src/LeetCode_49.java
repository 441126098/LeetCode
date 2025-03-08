//49. 字母异位词分组
//        中等
//相关标签
//        相关企业
//给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
//
//字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
//


import java.util.*;

public class LeetCode_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<List<Integer>, Integer> tempMap = new HashMap<>();
        for (int i=0;i<strs.length; i++) {
            List<Integer> temp = new ArrayList<>(26);
            for (int index = 0;index< 26; index++) {
                temp.add(index, 0);
            }
            for (int j=0;j<strs[i].length();j++) {
                temp.set(strs[i].charAt(j) - 'a', temp.get(strs[i].charAt(j) - 'a') +1) ;
            }
            if (tempMap.containsKey(temp)) {
                result.get(tempMap.get(temp)).add(strs[i]);
            } else {
                result.add(new ArrayList<>(Arrays.asList(strs[i])));
                tempMap.put(temp, result.size()-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        new LeetCode_49().groupAnagrams(strs);
    }
}

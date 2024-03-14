package leetcode.beginner;

import java.util.*;

public class GroupAnagram_49 {

    public static void main(String args[])
    {
        String [] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res  = new GroupAnagram_49().groupAnagrams(input);
        System.out.println(res);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}

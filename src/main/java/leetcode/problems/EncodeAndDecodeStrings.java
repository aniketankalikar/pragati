package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
	
	public static void main(String args[])
	{
		List<String> strs = new ArrayList<>();
		strs.add("we");
		strs.add("say");
		strs.add("yes");
		strs.add(":");
		strs.add(":");
		strs.add("@#$%^^&&***");
		
		String encString  = new EncodeAndDecodeStrings().encode(strs);
		System.out.println("Enc String "+encString);
		List<String> result = new EncodeAndDecodeStrings().decode(encString);
		System.out.println("Result List "+result);
	}
	
	public String encode(List<String> strs) {
		
		StringBuffer encStringBuff = new StringBuffer();

		strs.stream().forEach(v -> encStringBuff.append(v.length()).append("#").append(v));
		return encStringBuff.toString();
    }

    public List<String> decode(String str) {
    	List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;	
    }
}

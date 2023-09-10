package scaler.assigments.homework;

import java.util.HashMap;
import java.util.Map;

public class Adv_DSA_Hashing2_Q4 {
	
	public static void main(String args[])
	{
		String res  = new Adv_DSA_Hashing2_Q4().minWindow("ADOBECODEBANC", "ABC");
		System.out.println(res);
	}
	
	public String minWindow(String A, String B) {
		int b = B.length();// length of B
		int a = A.length();// length of A
		HashMap<Character, Integer> bFreq = new HashMap<>(); // freq map for B
		HashMap<Character, Integer> aFreq = new HashMap<>();// freq map for A
		int left = 0;
		int ans = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;

		// creating a freq hashmap for b
		for (int i = 0; i < b; i++) {
		char str = B.charAt(i);
		bFreq.put(str, bFreq.getOrDefault(str, 0) + 1);
		}
		// travering string A and finding the minimum length of string B
		for (int right = 0; right < a; right++) {
		char ch = A.charAt(right);
		aFreq.put(ch, aFreq.getOrDefault(ch, 0) + 1);

		while (check(aFreq, bFreq)) {
		int temp = ans; // temp variable to update the start and end substring
		ans = Math.min(ans, right - left + 1);
		if (temp != ans) {
		start = left;
		end = right;
		}
		char tchar = A.charAt(left);
		left++;
		aFreq.put(tchar, aFreq.get(tchar) - 1);// remove a single occurence for the char from A freq
		}
		}
		if (ans == Integer.MAX_VALUE) {
		return "";
		}

		return A.substring(start, end + 1); // Adjusted end index
		}
		// check function for freq A and B
		public boolean check(HashMap<Character, Integer> aFreq, HashMap<Character, Integer> bFreq) {
		for (Map.Entry<Character, Integer> entry : bFreq.entrySet()) {
		Character val = entry.getKey();
		// condition to check every occurence of b freq char is >= A freq char
		if (aFreq.getOrDefault(val, 0) < entry.getValue()) {
		return false;
		}
		}
		return true;
		}

}

package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashing2_Homework_Q6 {

	public static void main(String args[]) {

		String[] strArr = new String[] { "fine", "none", "no" };
		ArrayList<String> A = new ArrayList<String>(Arrays.asList(strArr));
		int res = new Hashing2_Homework_Q6().solve(A, "qwertyuiopasdfghjklzxcvbnm");
		System.out.println("Result ----> "+res);	
	}

	public int solve(ArrayList<String> A, String B) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < B.length(); i++) {
			map.put(B.charAt(i), i);
		}
		
		int maxLen = 0;
		
		for (int i = 0; i < A.size(); i++) {
			if(A.get(i).length() > maxLen)
			{
				maxLen = A.get(i).length() ;
			}
		}
		
		
		String input = "";
		int index = 0;
		int flag = 1;
		boolean cont = false;
		char prvch = A.get(0).charAt(index);
		while(flag == 1 && index <maxLen)
		{
			for (int i = 0; i < A.size(); i++) {
				input = A.get(i);
				if(index <input.length()) {
					char ch = input.charAt(index);
					if (map.get(prvch) < map.get(ch)) {
						flag = 1;
						prvch = ch;
					}
					else if (map.get(prvch) == map.get(ch) && (i!=0)) {
						flag = 1;
						cont = true;
					}
					else
					{
						if(i!=0)
						flag =0;
					}
				}
				

			}
			if(cont)
			{
				index++;
				if( index <A.get(0).length())
					prvch = A.get(0).charAt(index);
				else
					prvch = A.get(0).charAt(index-1);
			}
			else
			{
				break;
			}
			

		}
		
		
		return flag;
	}
}

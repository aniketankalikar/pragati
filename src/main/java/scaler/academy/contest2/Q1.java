package scaler.academy.contest2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Q1 {

	public static void main(String args[]) {
		String str1 = "xcu2";
		String str2 = "qcg4";
		String str3 = "q9";
		String str4 = "hcl2";

		List<String> list = new ArrayList<String>();
		
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str4);

		
		list.sort(new Comparator<String>() {
			public int compare(String a, String b)
			{
				int intA = Integer.parseInt(a.replaceAll("[^0-9]", ""));
				int intB = Integer.parseInt(b.replaceAll("[^0-9]", ""));
				
				
				
				if(intA == intB)
				{
					return 1;
				}
				else if(intA < intB)
				{
					return 1;
				}
				else
				{
					return -1;
				}
			
			}
		});
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
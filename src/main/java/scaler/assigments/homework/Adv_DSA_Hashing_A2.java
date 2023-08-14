package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Adv_DSA_Hashing_A2 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(7);A.add(1);A.add(3);A.add(4);A.add(1);A.add(7);
		int ans  = new Adv_DSA_Hashing_A2().solve(A);
		System.out.println(ans);
	}

	public int solve(ArrayList<Integer> A) {

		int ans = Integer.MAX_VALUE;

		Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();

		// Update the latest index in the map against each A.get(i)
		for (int i = 0; i < A.size(); i++) {
			hmp.put(A.get(i),i);
		}

		// If the list size === map size there is no special pair
		if(A.size() == hmp.size())
			return -1;	
		
		for(int i=0;i<A.size();i++)
		{
			if(hmp.get(A.get(i)) == null)
					continue;
			
			int mindiff = Math.abs(hmp.get(A.get(i)) - i);
			ans = mindiff!=0 ? ( Math.min(ans, mindiff)) : ans;
		}
		
		return ans;

	}

}

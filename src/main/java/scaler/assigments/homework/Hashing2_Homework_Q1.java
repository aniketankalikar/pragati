package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashing2_Homework_Q1 {
	
	public static void main(String args[])
	{
		Integer [] arr = new Integer[] {2, 1, 2, 1, 2, 1, 2, 1, 2  };
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		Integer B = 1;
		new Hashing2_Homework_Q1().countPairDiff(A, B);
		// Expected 2, Actual - 0
		
	}

	public int solve(ArrayList<Integer> A, int B) {

		Integer a = 0, b = 0;
		Integer pairCount = 0;
		int cnt = 0;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.size(); i++) {
			a = A.get(i);
			b = B - a;
			if (mp.get(b) != null) {
				pairCount += mp.get(b);
			}
			if (mp.get(a) != null) {
				cnt = mp.get(a) + 1;
				mp.replace(a, cnt);
			} else {
				mp.put(a, 1);
			}

		}

		return pairCount % (1000000007);
	}
	
	 public int countPairDiff(ArrayList<Integer> A, int B) {

	        Integer a = 0, b = 0;
			Integer pairCount = 0;
			int cnt = 0;
			Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
			for (int i = 0; i < A.size(); i++) {
				a = A.get(i);
				b = (a-B) < 0 ? (a-B)*(-1) :  a- B;
				if (mp.get(b) != null) {
					pairCount += mp.get(b);
				}
				if (mp.get(a) != null) {
					cnt = mp.get(a) + 1;
					mp.replace(a, cnt);
					
				} else {
					mp.put(a, 1);
				}

			}
			return pairCount % (1000000007);
	    }
}

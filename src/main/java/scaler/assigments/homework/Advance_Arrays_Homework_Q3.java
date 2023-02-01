package scaler.assigments.homework;

import java.util.ArrayList;

public class Advance_Arrays_Homework_Q3 {
	
	public static void main(String args[])
	{
		new Advance_Arrays_Homework_Q3().test();
	}
	
	public void test()
	{
		int a = 100%3%3;
		System.out.println(a);
	}

	public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D) {

		Integer obs1 = 0;
		Integer obs2 = 0;
		Integer max = Integer.MAX_VALUE;
		Integer min = Integer.MIN_VALUE;

		for (int i = 0; i < A.size(); i++) {
			if (i == 0) {
				Integer max1 = Math.max(A.get(i).intValue(), B.get(i).intValue());
				Integer max2 = Math.max(C.get(i).intValue(), D.get(i).intValue());
				max = Math.max(max1.intValue(), max2.intValue());
				
				Integer min1 = Math.min(A.get(i).intValue(), B.get(i).intValue());
				Integer min2 = Math.min(C.get(i).intValue(), D.get(i).intValue());
				min = Math.min(min1.intValue(), min2.intValue());
				
			} else {
				max = A.get(i) + B.get(i) + C.get(i) + D.get(i) > max ? A.get(i) + B.get(i) + C.get(i) + D.get(i) : max;
				min = A.get(i) + B.get(i) + C.get(i) + D.get(i) < min ? A.get(i) + B.get(i) + C.get(i) + D.get(i) : min;
			}

		}

		obs1 = max - min;

		for (int i = 0; i < A.size(); i++) {
			if (i == 0) {
				Integer max1 = Math.max(A.get(i).intValue(), B.get(i).intValue());
				Integer max2 = Math.max(C.get(i).intValue(), D.get(i).intValue());
				max = Math.max(max1.intValue(), max2.intValue());
				
				Integer min1 = Math.min(A.get(i).intValue(), B.get(i).intValue());
				Integer min2 = Math.min(C.get(i).intValue(), D.get(i).intValue());
				min = Math.min(min1.intValue(), min2.intValue());
			} else {
				max = A.get(i) - B.get(i) - C.get(i) - D.get(i) > max ? A.get(i) - B.get(i) - C.get(i) - D.get(i) : max;
				min = A.get(i) - B.get(i) - C.get(i) - D.get(i) < min ? A.get(i) - B.get(i) - C.get(i) - D.get(i) : min;
			}

		}

		obs2 = max - min;

		return obs1 > obs2 ? obs1 : obs2;
	}
}

package scaler.assigments.homework;

import java.util.ArrayList;

public class Advance_Arrays_Q3 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(-1);
		
		new Advance_Arrays_Q3().maxArr(A);
	}

	public int maxArr(ArrayList<Integer> A) {

		int obs1 = 0;
		int obs2 = 0;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		for (int i = 0; i < A.size(); i++) {
			if (i == 0) {
				max = A.get(i);
				min = A.get(i);
			} else {
				max = A.get(i) + i > max ? A.get(i) + i : max;
				min = A.get(i) + i < min ? A.get(i) + i : min;
			}

		}

		obs1 = max - min;

		for (int i = 0; i < A.size(); i++) {
			if (i == 0) {
				max = A.get(i);
				min = A.get(i);
			} else {
				max = A.get(i) - i > max ? A.get(i) - i : max;
				min = A.get(i) - i < min ? A.get(i) - i : min;
			}

		}

		obs2 = max - min;

		return obs1 > obs2 ? obs1 : obs2;

	}
}

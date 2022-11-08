package scaler.assigments.homework;

import java.util.ArrayList;

public class RangeSum_Q3 {

	public static void main(String args[]) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(7);
		A.add(3);
		A.add(1);
		A.add(5);
		A.add(5);
		A.add(5);
		A.add(1);
		A.add(2);
		A.add(4);
		A.add(5);

		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		
		
		a.add(7);
		a.add(10);
		b.add(3);
		b.add(10);
		c.add(3);
		c.add(5);
		d.add(1);
		d.add(10);
		B.add(a);
		B.add(b);
		B.add(c);
		B.add(d);
		
		new RangeSum_Q3().rangeSum(A, B);

	}

	public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

		ArrayList<Long> result = new ArrayList<Long>();
		int[] pf = new int[A.size()];

		Integer[] input = new Integer[A.size()];
		input = A.toArray(input);

		ArrayList<Integer[]> tempList = new ArrayList<Integer[]>();
		Integer[] tempArr = null;
		for (ArrayList<Integer> idxList : B) {
			tempArr = new Integer[idxList.size()];
			tempArr = idxList.toArray(tempArr);
			tempList.add(tempArr);
		}

		Integer[][] indexes = new Integer[B.size()][];
		indexes = tempList.toArray(indexes);

		// Build the Prefix Sum Array
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				pf[i] = input[i];
			} else {
				pf[i] = pf[i - 1] + input[i];
			}
		}

		int startIndex = 0;
		int endIndex = 0;
		long sum = 0;
		for (int j = 0; j < indexes.length; j++) {
			startIndex = indexes[j][0]-1;
			endIndex = indexes[j][1]-1;
			
				if (startIndex == 0) {
					sum += Long.valueOf(pf[endIndex]);
				} else {
					sum += Long.valueOf(pf[endIndex]) - Long.valueOf(pf[startIndex - 1]);
				}
				result.add(sum);
				sum =0;
			
			
		}

		return result;
	}

}

package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Advance_Arrays_Homework_Q2 {

	public static void main(String args[]) {

		ArrayList<Integer> result = new  Advance_Arrays_Homework_Q2().flip("111");
		System.out.println(result);
	}

	public ArrayList<Integer> flip(String A) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '1') {
				list.add(-1);
			}
			if (A.charAt(i) == '0') {
				list.add(1);
			}
		}
		int currSum = 0;
		int maxSum = 0;
		int start = 0, end = -1;
		int index = 0;
		for (int i = 0; i < A.length(); i++) {
			currSum += list.get(i);
			if (currSum < 0) {
				currSum = 0;
				index = i + 1;
			} else if (currSum > maxSum) {
				maxSum = currSum;
				start = index;
				end = i;
			}
		}
		list.clear();
		if (end != -1) {
			list.add(start + 1);
			list.add(end + 1);
			return list;
		}
		return list;

	}

}

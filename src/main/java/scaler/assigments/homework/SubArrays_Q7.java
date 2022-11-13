package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrays_Q7 {

	public static void main(String args[]) {
		
		Integer [] arr  = new Integer [] {36, 63, 63, 26, 87, 28, 77, 93, 7};
		new SubArrays_Q7().solve(new ArrayList<Integer>(Arrays.asList(arr)));

	}

	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {

		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>(A.size());

		for (int i = 0; i < A.size(); i++) {
			for (int j = i; j < A.size(); j++) {
				ArrayList<Integer> ar = new ArrayList<>();
				for(int k=i;k<=j;k++){
				ar.add(A.get(k));
				}
				input.add(ar);
			}
		}

		return input;
	}
}
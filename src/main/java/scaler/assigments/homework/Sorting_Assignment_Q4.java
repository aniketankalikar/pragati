package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_Assignment_Q4 {

	public static void main(String args[]) {
		/*
		 * Integer[] arr = new Integer[] { 8, 89 }; List<Integer> lst = new
		 * ArrayList<Integer>(Arrays.asList(arr)); new
		 * Sorting_Assignment_Q4().largestNumber(lst);
		 */
		
		Integer[] arr = new Integer[] {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
		ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr));
		new Sorting_Assignment_Q4().sortColors(lst);
	}

	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public String largestNumber(final List<Integer> A) {

		List<Integer> B = new ArrayList<Integer>(A);

		Collections.sort(B, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return (a.toString() + b.toString()).compareTo(b.toString() + a.toString()) > 0 ? -1 : 1;
			}
		});

		String largestNo = B.toString().replaceAll("\\D", "");
		return largestNo;
	}

	public ArrayList<Integer> sortColors(ArrayList<Integer> A) {

		Collections.sort(A, new Comparator<Integer>() {

			public int compare(Integer a, Integer b) {

				if (a.intValue() < b.intValue()) {
					return -1;
				} else if (a.intValue() > b.intValue()){
					return 1;
				}
				else
				{
					return 0;
				}
			}

		});

		return A;
	}

}
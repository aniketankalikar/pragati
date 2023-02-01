package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Advance_Arrays_HomeworkQ1 {

	public static void main(String args[]) {
		
		Integer arr[] = new Integer[] {0, 0, 4, 4, 6, 0, 9, 6, 5, 1 };
		/*
		 * Integer arr[] = new Integer[3]; for (int i = 0; i < arr.length; i++) { arr[i]
		 * = 9; }
		 */

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr));
		new Advance_Arrays_HomeworkQ1().plusOne(A);
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> digits) {

		int index = digits.size() - 1;

		// while the index is valid and the value at [index] ==
		// 9 set it as 0
		while (index >= 0 && digits.get(index) == 9) {
			digits.set(index, 0);
			index -= 1;
		}

		// if index < 0 (if all digits were 9)
		if (index < 0) {
			// insert an one at the beginning of the vector
			digits.set(0, 1);
			// Add one extra zero at the end of the vector
			digits.add(digits.size(), 0);

		}

		// else increment the value at [index]
		else
			digits.set(index, digits.get(index) + 1);
		
		while(digits.get(0)==0)
		{
			digits.remove(0);
		}

		return digits;
	}

}

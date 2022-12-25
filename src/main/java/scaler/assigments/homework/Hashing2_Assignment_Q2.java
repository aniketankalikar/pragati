package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hashing2_Assignment_Q2 {
	
	public static void main(String args[])
	{
		Integer []  arr = new Integer[] { 46, 59, 55, 61, 28, 13, 22, 18, 26, 18, 31, 95, 91, 95, 21, 95, 0, 67, 64, 84, 25, 12, 98, 67, 24, 67, 99, 29, 26, 49, 73, 77, 79, 77, 80, 39, 68, 36, 35, 72, 45, 60, 58, 83, 98, 10, 95, 5, 40, 6, 99, 81, 19, 38, 75, 4, 25, 91, 1, 24, 52, 56, 30, 43, 1, 46, 87, 30, 23, 73, 40, 13, 81, 31, 75, 31, 21, 52, 62, 29, 58, 97, 0, 42, 6, 44, 56, 11, 14, 59, 96, 91, 53, 23, 25, 19, 99, 81, 25, 53, 85, 53, 46, 76, 31, 29, 97, 64, 16, 70, 36, 95, 27, 52, 37, 81, 48, 71, 83, 21, 56, 78, 1, 88, 30, 97, 80, 87, 43, 27, 43, 29, 10, 7, 28, 34, 51, 34, 0, 26, 13, 39, 23, 64, 92, 34, 8, 73, 45, 2, 10, 9, 81, 69, 65, 6, 81, 41, 40, 24, 77, 10, 40, 17, 76, 16, 67, 25, 24, 17, 14, 90, 10, 50, 90, 41, 57, 33, 47, 65, 27, 68, 47, 2, 36, 82, 76, 64, 12, 59, 32, 42, 56, 76, 1, 21, 47, 56, 84, 63 };
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(arr));
		new Hashing2_Assignment_Q2().solve(0,B);
	}

	public int solve(int A, ArrayList<Integer> B) {

		Integer a = 0;
		Integer b = 0;
		Set<Integer> hset = new HashSet<Integer>();
		for (int i = 0; i < B.size(); i++) {
			a = B.get(i);
			b = A - a;
			if (hset.contains(b)) {
				return 1;
			}
			hset.add(a);

		}
		return 0;

	}
}

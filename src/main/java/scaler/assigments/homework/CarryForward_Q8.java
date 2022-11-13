package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class CarryForward_Q8 {

	public static void main(String args[]) {
		Integer inpArr[] = new Integer[] { -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961,
				-509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538,
				869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338,
				-243, -963, -141, -277, 741, 529, -222, -684, 35 };
		// Integer inpArr [] = new Integer[] {1,2,1,4,5};
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(inpArr));
		int count = new CarryForward_Q8().solve(A, 48);
		System.out.println("count ---> " + count);

	}

	public int solve(ArrayList<Integer> A, int B) {

		int n = A.size();
		int left = 0, right = 0, max = 0;
		for (int i = n - 1; i >= n - B; i--) {
			right += A.get(i);
		}
		max = right;

		for (int i = 0; i < B; i++) {
			left += A.get(i);
			right -= A.get(n - B + i);
			max = Math.max(max, left + right);
		}
		return max;
	}
}

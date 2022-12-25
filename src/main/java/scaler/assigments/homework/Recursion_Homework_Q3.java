package scaler.assigments.homework;

public class Recursion_Homework_Q3 {

	public static void main(String args[]) {
		int A = new Double(Math.pow(10, 5)).intValue();
		int B = new Double(Math.pow(10, 18)).intValue();
		new Recursion_Homework_Q3().solve(A, Long.valueOf(Integer.valueOf(A)));
	}

	public int solve(int A, long B) {

		if (A == 1)
			return 0; // base case
		int r = solve(A - 1, B / 2); // recursive call

		return B % 2 == 1 ? r ^ 1 : r; // conditional return

	}

}

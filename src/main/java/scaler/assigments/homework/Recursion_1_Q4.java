package scaler.assigments.homework;

public class Recursion_1_Q4 {
	
	public static void main(String args[])
	{
		new Recursion_1_Q4().solve(9);
	}

	public void solve(int A) {

		printChar(A);
		System.out.println("");
	}

	public void printChar(int N) {
		if (N == 1) {
			System.out.print("1");
			return;
		}

		System.out.print(N + " ");
		printChar(N - 1);
	}
}

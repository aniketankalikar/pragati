package scaler.assigments.homework;

public class Recursion_1_Homework_Q2 {

	public int solve(int A) {
		
		int sum = sumOfDigits(A);
		
		return sum;
		
	}
	
	public int sumOfDigits(int n)
	{
		if(n==0)
			return 0;
		
		return (n%10 + sumOfDigits(n/10));
		
		
	}

	
}

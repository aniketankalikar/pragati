package scaler.assigments.homework;

public class Recursion2_Homework_Q1 {
	
	public static void main(String args[])
	{
		int val = new Recursion2_Homework_Q1().solve(83557);
		System.out.println(val);
	}

	public int solve(int A) {

		if (String.valueOf(A).length() == 1)
		{
			if(A==1)
				return 1;
			else
				return 0;
		}
		
		String strInput = String.valueOf(A);
		int sum = 0;
		for (int i = 0; i < strInput.length(); i++) {
			sum += Integer.parseInt(String.valueOf(strInput.charAt(i)));
		}

		sum = solve(sum);

		return sum;
	}
}
package scaler.assigments.homework;

public class Recursion2_Assignment_Q1 {

	public static void main(String args[])
	{
		new Recursion2_Assignment_Q1().pow(2, 3, 3);
	}
	
	public int pow(int A, int B, int C) {

		if ((A==0 && B==0) || (A==0 && B!=0)  )  
			return 0;
		else if(B==0 && A!=0)
			return 1;

		Long P = Long.valueOf(pow(A, B / 2, C));

		if (B % 2 == 0) {
			Long result = (P * P) % C;
			return result.intValue();
		} else {
			Long result = ((P * P) % C * A) % C;
			return result.intValue();
		}

	}

}
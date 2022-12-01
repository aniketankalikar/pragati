package scaler.assigments.homework;

public class BitMap2_Assignment_Q4 {
	
	public static void main(String args[])
	{
		new BitMap2_Assignment_Q4().solve(309,9);
	}

	public int solve(int A, int B) {
		int result = 0;
		int x = Integer.MAX_VALUE;
		int remainder = 0;
		StringBuilder builder = new StringBuilder();
		while (x > 0) {
			x = A / 2;
			remainder = A % 2;
			A = x;
			builder.append(remainder);
		}
		
		char [] chArray = new char [32];
		chArray = builder.toString().toCharArray();
		if (B< chArray.length && chArray[B] == '1')
			chArray[B] = '0';
		
		builder = new StringBuilder(new String(chArray));
		builder = builder.reverse();
		result= Integer.parseInt(builder.toString(),2);
		return result;
	}
}
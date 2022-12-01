package scaler.assigments.homework;

public class BitManipulations_Q7 {
	
	public static void main(String args[])
	{
		new BitManipulations_Q7().solve(14, 6);
	}

	public int solve(int A, int B) {
		String input = String.valueOf(A);
		char[] inputArr = input.toCharArray();
		int powIndex = 0;
		int decNum = 0;
		 for(int i=inputArr.length-1;i >=0 ;i--)
	     {
			int powValue = (int) Math.pow(B,powIndex); 
		    decNum+= Character.getNumericValue(inputArr[i])  * powValue;
            powIndex++;
	     }

		return decNum;
	}

}

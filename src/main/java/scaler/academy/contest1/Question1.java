package scaler.academy.contest1;

public class Question1 {
	
	public static void main(String args[])
	{
		new Question1().solve(5,4);
	}
	public int solve(int A, int B) {

		int result = 0;
		String input = "";
		

		for (int i = 1; i <= A; i++) {
			input += "1";
		}
		for (int i = 1; i <= B; i++) {
			input += "0";
		}

		char[] inputArr = input.toCharArray();
		int powIndex = 0;
		for(int i=inputArr.length-1;i>=0;i--)
        {
            if(inputArr[i] !='0' )
            {
                result+=Math.pow(2,powIndex);
                
            }
            powIndex++;
        }

		return result;

	}
}

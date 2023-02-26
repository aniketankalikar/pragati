package scaler.assigments.homework;

public class Pattern_Matching_Homework_Q2 {

	public static void main(String args[]) {
		String res = new Pattern_Matching_Homework_Q2().solve("the sky is blue");
		System.out.println("res--->" + res);
	}

	public String solve(String A) {

		String result = "";
		
		String strArr [] = A.split(" ");
		
		for(int i =  strArr.length -1 ; i>=0;i--)
		{
			result += strArr[i].toString() + " ";
		}
		
		return result.trim();
	}

}
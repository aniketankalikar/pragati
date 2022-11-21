package scaler.academy.contest1;

import java.util.ArrayList;

public class Question2 {
	
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		B.add(new ArrayList<Integer>());
		B.add(new ArrayList<Integer>());
		B.get(0).add(0, 0);
		B.get(0).add(1, 2000);
		B.get(1).add(0, 2);
		B.get(1).add(1, 1987);
		
		String input= "scaler";
		for(int i=0;i<1000;i++)
		{
			input+="scaler";
		}
		
		new Question2().solve(input, B);
	}
	
	public ArrayList<Integer> solve(String A, ArrayList<ArrayList<Integer>> B) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		int rows = B.size();
		for (int i = 0; i < rows; i++) {
			result.add(checkForVowels(B.get(i).get(0), B.get(i).get(1), A));
		}

		return result;
	}

	public int checkForVowels(int startIndex, int endIndex, String input) {
		int vowelCount = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				vowelCount++;
			}
		}

		return vowelCount;
	}
}

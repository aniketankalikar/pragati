package scaler.assigments.homework;

public class Pattern_Matching_Homework_Q1 {

	public static void main(String args[]) {
		int res = new Pattern_Matching_Homework_Q1().solve(5,"aaaaa");
		System.out.println("res--->" + res);
	}

	 public int solve(int A, String B) {
	        int n = B.length();
	        int[] freq = new int[26];

	        for(int i = 0; i < n; i++){
	            freq[B.charAt(i) - 'a']++;
	        }

	        for(int i = 0; i < 26; i++){
	            if((freq[i] % A) != 0)
	                return -1;
	        }

	        return 1;
	    }

}
package scaler.assigments.homework;

public class Pattern_Matching_Assignment_Q1 {

	public static void main(String args[]) {
		int res = new Pattern_Matching_Assignment_Q1().solve("aab");
		System.out.println("res--->" + res);
	}

	public int solve(String A) {

		int len = A.length();
		char lmin = Character.MAX_VALUE;
		char lmax = Character.MIN_VALUE;
		char rmin = Character.MAX_VALUE;
		char rmax = Character.MIN_VALUE;

		char ch = ' ';
		for (int i = 0; i < len; i++) {
			ch = A.charAt(i);
			if (ch % 2 != 0) {
				lmin = min(lmin, ch);
				lmax = max(lmax, ch);
			} else if (ch % 2 == 0) {
				rmin = min(rmin, ch);
				rmax = max(rmax, ch);
			}
		}
	
		if (!isBoring(lmin, rmin) || !isBoring(lmin, rmax) || !isBoring(rmax, rmax)) {
			return 1;
		}

		return 0;

	}

	private boolean isBoring(char lmin, char rmin) {

		if (lmin - rmin == 1 || rmin - lmin == 1 || lmin - rmin == 0 || rmin - lmin == 0) {
			return true;
		}

		return false;
	}

	private char max(char lmax, char ch) {
		if (lmax > ch)
			return lmax;
		return ch;
	}

	private char min(char lmin, char ch) {
		if (lmin < ch)
			return lmin;
		return ch;
	}

}
package leetcode.problems;

// TWO POINTER APPROACH

public class ValidPalindrome_125 {

	public static void main(String args[]) {
		String input = "A man, a plan, a canal: Panama";

		boolean res = new ValidPalindrome_125().isPalindrome(input);
		System.out.println(res);

	}

	public boolean isPalindrome(String s) {

		int l = 0;
		int r = s.length() - 1;
		while (l < r) {
			while (!isAlphaNumeric(s.charAt(l)))
				l++;
			while (!isAlphaNumeric(s.charAt(r)))
				r--;
			if (s.toLowerCase().charAt(l) != s.toLowerCase().charAt(r))
				return false;

			l++;
			r--;
		}

		return true;
	}

	private boolean isAlphaNumeric(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
	}

}

package scaler.assigments.homework;

public class Adv_DSA_ZAlgo_H3 {

	public static void main(String args[]) {
		String A = "abccbahijk";
		int start = A.length();
		StringBuffer str = new StringBuffer();
        str.append(A);
        A += "#";
        A += str.reverse().toString();
		int[] zArray = new Adv_DSA_ZAlgo_H3().consutructZArray(A);

		int ans = new Adv_DSA_ZAlgo_H3().getMinCharsForPalindrome(A, zArray, start);
		System.out.println(ans);

	}

	private int getMinCharsForPalindrome(String A, int[] zArray, int start) {
		for (int i = start + 1; i < A.length(); i++)
			if (zArray[i] == (A.length() - i))
				return i - start - 1;
		return 0;
	}

	public int[] consutructZArray(String A) {
		int[] zArray = new int[A.length()];

		int length = A.length();

		int left = 0, right = 0;

		zArray[0] = length;

		for (int i = 1; i < length; i++) {
			if (i > right) {
				left = i;
				right = i;
				while (right < length && A.charAt(right) == A.charAt(right - left)) {
					right++;
				}
				zArray[i] = right - left;
				right--;
			} else {
				if (i + zArray[i - left] <= right) {
					zArray[i] = zArray[i - left];
				} else {
					left = i;
					while (right < length && A.charAt(right) == A.charAt(right - left)) {
						right++;
					}
					zArray[i] = right - left;
					right--;

				}
			}
		}

		return zArray;

	}

}

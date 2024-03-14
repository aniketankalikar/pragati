package leetcode.beginner;

public class CountGreater {

	public static void main(String args[]) {
		int arr[] = new int[] { 1, 2, 5, 4, 5 };
		int n = arr.length;

		int max = arr[0];
		int freq = 0;

		for (int i = 1; i < n; i++) {
			if (arr[i] == max) {
				freq++;
			}
			if (arr[i] > max) {
				max = arr[i];
				freq = 1;
			}
		}

		int no_of_ele = n - freq;
		System.out.println(no_of_ele);
	}

}

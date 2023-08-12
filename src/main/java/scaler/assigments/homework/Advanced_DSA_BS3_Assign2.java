package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Advanced_DSA_BS3_Assign2 {

	public int solve(ArrayList<Integer> A, int B) {

		Integer[] arr = (Integer[]) A.toArray();
		Arrays.sort(arr);
		int n = arr.length;
		int s = 1; // min possible distance b/w any two cows wil be 1
		int e = arr[n - 1] - arr[0];// max possible distance will be the distance between 1st and last coww
		int ans = 0;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			// checking if it is possile to put B cows at atleast min distance of mid
			if (isPossible(arr, mid, B)) {
				// if possible then mid can be possible ans
				ans = mid;
				// check if we can put cows at more large distance
				s = mid + 1;
			} else// if not possible then try to put cows at distance<mid
			{
				e = mid - 1;
			}
		}
		return ans;
	}

	private boolean isPossible(Integer[] A, int mid, int B) {
		int cows_count = 1, last_placed = A[0], dist = A[0];
		for (int ele : A) {
			dist = ele - last_placed;
			if (dist >= mid) {
				cows_count++;
				last_placed = ele;

				if (cows_count == B) {
					return true;
				}
			}

		}
		return false;
	}
}

package scaler.assigments.homework;

import java.util.ArrayList;

public class Advanced_DSA_BS3_Assign1 {

	public static void main(String args[]) {
		
		  ArrayList<Integer> C1 = new ArrayList<Integer>(); C1.add(1); C1.add(8);
		  C1.add(11); C1.add(3); int minTime = new Advanced_DSA_BS3_Assign1().paint(10,
		  1, C1); System.out.println("minTime ---> "+minTime);
		  
		  
		  ArrayList<Integer> C2 = new ArrayList<Integer>(); C2.add(1); C2.add(10);
		  minTime = new Advanced_DSA_BS3_Assign1().paint(2, 5, C2);
		  System.out.println("minTime ---> "+minTime);
		 
		// 9400003
		ArrayList<Integer> C3 = new ArrayList<Integer>();
		C3.add(1000000);
		C3.add(1000000);
		minTime = new Advanced_DSA_BS3_Assign1().paint(1, 1000000, C3);
		System.out.println("minTime ---> " + minTime);
	}

	public int paint(int A, int B, ArrayList<Integer> C) {

		long low = (long) C.get(0) * B;
		long high = 0;
		long ans = 0;
		for (int i = 0; i < C.size(); i++) {
			long val = (long) C.get(i) * B;
			if (val > low) {
				low = val;
			}
			high += val;
		}

		while (low <= high) {
			long mid = low + (high - low) / 2;
			if (check(mid, C, A, B)) {
				// update the answer and move the end to mid-1
				ans = mid;
				high = mid - 1;
			} else {
				// move the start to mid+1
				low = mid + 1;
			}
		}
		int mod = (int) Math.pow(10, 7) + 3;
		return (int) (ans % mod);
	}

	boolean check(long mid, ArrayList<Integer> C, int A, int B) {

		int cnt = 1; // Counter to keep track of painter
		long sum = 0; // variable to stop the current sum of time
		for (int i = 0; i < C.size(); i++) {
			// will calculate the time taken to pain the board.
			// if sum exceeds the given time then we will increment the counter and reset
			// the sum to currrent board length multiple by B
			sum = sum + (long) C.get(i) * B;
			if (sum > mid) {
				cnt = cnt + 1;
				sum = (long) C.get(i) * B;
				// if the counter exceeds the limit A then it is not possible to paint all the
				// board with the available painter
				if (cnt > A) {
					return false;
				}
			}
		}
		return true;
	}

}

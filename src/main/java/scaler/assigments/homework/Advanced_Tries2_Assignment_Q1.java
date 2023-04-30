package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Advanced_Tries2_Assignment_Q1 {

	public static void main(String args[]) {
		int ans = new Advanced_Tries2_Assignment_Q1().solve(new int[] { 5, 17, 100, 11 });
		System.out.println(ans);
	}

	public int solve(int[] A) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		TrieNode root = new TrieNode();
		for (int i = 0; i < A.length; i++) {
			maxxor(A[i], root, arr);
		}
		// for(int i=0;i<arr.size();i++)
		// System.out.println(arr.get(i));

		return Collections.max(arr);

	}

	public void maxxor(int A, TrieNode root, ArrayList<Integer> arr) {
		TrieNode t = root, pointer = root;
		for (int i = 31; i >= 0; i--) {
			int val = ((1 << i) & A) == 0 ? 0 : 1;
			if (t.c[val] != null) {
				t = t.c[val];
			} else {
				TrieNode nn = new TrieNode();
				t.c[val] = nn;
				t = nn;
			}
			if (pointer.c[1 - val] != null)
				pointer = pointer.c[1 - val];
			else
				pointer = pointer.c[val];
		}
		t.val = A;
		arr.add(A ^ pointer.val);
	}
}

class TrieNode {
	TrieNode[] c = new TrieNode[2];
	int val;

	TrieNode() {
		c[0] = null;
		c[1] = null;
		val = 0;

	}
}
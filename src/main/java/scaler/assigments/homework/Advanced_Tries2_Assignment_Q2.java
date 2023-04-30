package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Advanced_Tries2_Assignment_Q2 {

	public static void main(String args[]) {
		int[] result = new Advanced_Tries2_Assignment_Q2().solve(new int[] { 5, 17, 100, 11 });
		System.out.println(result);
	}

	public int[] solve(int[] A) {

		List<Result> result = new ArrayList<Result>();
		Node2 root = new Node2(0);
		for (int i = 0; i < A.length; i++) {
			maxxor(A[i], root, result);
		}
		// for(int i=0;i<arr.size();i++)
		// System.out.println(arr.get(i));
		// result[0] = Collections.max(arr);
		return null;

	}

	public void maxxor(int A, Node2 root, List<Result> result) {
		Node2 t = root, pointer = root;
		for (int i = 31; i >= 0; i--) {
			int val = ((1 << i) & A) == 0 ? 0 : 1;
			if (t.c[val] != null) {
				t = t.c[val];
			} else {
				Node2 nn = new Node2(val);
				t.c[val] = nn;
				t = nn;
			}
			if (pointer.c[1 - val] != null)
				pointer = pointer.c[1 - val];
			else
				pointer = pointer.c[val];
		}
		t.val = A;
		int val = A ^ pointer.val;
		Result rs = new Result(val,0);
		result.add(rs);

	}

}

class Node2 {
	Node2[] c = new Node2[2];
	int val;
	int index;
	Node2(int index) {
		this.c[0] = null;
		this.c[1] = null;
		this.val = 0;
		this.index = index;

	}
}

class Result {
	int val;
	int endIndex;

	public Result(int val, int endIndex) {
		this.val = val;
		this.endIndex = endIndex;
	}
}
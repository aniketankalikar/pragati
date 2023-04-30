package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Advanced_Tries2_Assignment_Q1_A {

	public static void main(String args[]) {
		int ans = new Advanced_Tries2_Assignment_Q1_A().solve(new int[] { 5, 17, 100, 11 });
		System.out.println(ans);
	}

	public int solve(int[] A) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Node1 root = new Node1();
		for (int i = 0; i < A.length; i++) {
			maxxor(A[i], root, arr);
		}
		// for(int i=0;i<arr.size();i++)
		// System.out.println(arr.get(i));

		return Collections.max(arr);

	}

	public void maxxor(int A, Node1 root, ArrayList<Integer> arr) {
		Node1 t = root, pointer = root;
		for (int i = 31; i >= 0; i--) {
			int val = ((1 << i) & A) == 0 ? 0 : 1;
			if (t.c[val] != null) {
				t = t.c[val];
			} else {
				Node1 nn = new Node1();
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

class Node1 {
	Node1[] c = new Node1[2];
	int val;

	Node1(){
            c[0]=null;
            c[1]=null;
            val=0;

        }
}
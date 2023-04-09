package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Trees_Assignment_Q3 {

	public static void main(String args[]) {
		Integer[] arrA = new Integer[] { 2, 1, 3 };
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arrA));

		Integer[] arrB = new Integer[] { 2, 3, 1 };
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(arrB));

		new Trees_Assignment_Q3().buildTree(A, B);
	}

	/**
	 * Definition for binary tree class TreeNode { int val; TreeNode left; TreeNode
	 * right; TreeNode(int x) { val = x; left=null; right=null; } }
	 */
	public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {

		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < A.size(); i++) {
			hash.put(A.get(i), i);
		}
		Collections.reverse(B);
		// System.out.println(B.get(0));
		return Tree(B, 0, B.size() - 1, A, 0, A.size() - 1, hash);
	}

	public TreeNode Tree(ArrayList<Integer> pre, int s1, int e1, ArrayList<Integer> in, int s2, int e2,
			HashMap<Integer, Integer> hash) {
		if (s1 > e1)
			return null;
		TreeNode node = new TreeNode(pre.get(s1));
		int x = e2 - hash.get(pre.get(s1));
		node.right = Tree(pre, s1 + 1, s1 + x, in, hash.get(pre.get(s1)) + 1, e2, hash);
		node.left = Tree(pre, s1 + x + 1, e1, in, s2, hash.get(pre.get(s1)) - 1, hash);
		// System.out.println((s1+x+1)+" "+e1);
		return node;
	}

}

package scaler.assigments.homework;

import java.util.HashMap;
import java.util.Map;

public class Advanced_Trees_LCA_Assignment_Q2 {

	public static void main(String args[])
	{
		TreeNode N1 = new TreeNode(1);
		TreeNode N2 = new TreeNode(2);
		TreeNode N3 = new TreeNode(3);
		TreeNode N4 = new TreeNode(4);
		TreeNode N5 = new TreeNode(5);
		
		/*
		 * N1.left = N2; N1.right = N3; N2.left = N4; N2.right = N5;
		 */
		
		N3.left = N1;
		
		int res = new Advanced_Trees_LCA_Assignment_Q2().lca(N3, 1, 1);
		System.out.println(res);
		
		
	}

	/**
	 * Definition for binary tree class TreeNode { int val; TreeNode left; TreeNode
	 * right; TreeNode(int x) { val = x; left=null; right=null; } }
	 */

	int T = 0;

	Map<Integer, Ancestor> mp = new HashMap<Integer, Ancestor>();

	public int lca(TreeNode A, int B, int C) {

		TreeNode curr = A;
		TreeNode root = A;
		travel(root);

		while (curr != null) {
			if (isAncestor(curr.left, B, C)) {
				curr = curr.left;
			} else if (isAncestor(curr.right, B, C)) {
				curr = curr.right;
			} else {
				return curr.val;
			}
		}

		return curr.val;
	}

	public void travel(TreeNode root) {

		if (root == null) {
			return;
		}

		Ancestor as = new Ancestor(T, -1, root.val);
		mp.put(root.val, as);
		T += 1;
		travel(root.left);
		travel(root.right);
		mp.get(root.val).setOut(T);
		T += 1;

	}

	public boolean isAncestor(TreeNode root, int B, int C) {

		if(root!=null)
		{
			Ancestor BAns = mp.get(B);
			Ancestor CAns = mp.get(C);
			Ancestor rootAns = mp.get(root.val);

			if ((rootAns.in < B && rootAns.out > B) && (rootAns.in < C && rootAns.out > C)) {
				return true;
			}
		}
		
		return false;
	}
}

class Ancestor {
	int in;
	int out;
	int val;

	public Ancestor(int inVal, int outVal, int value) {
		this.in = inVal;
		this.out = outVal;
		this.val = value;
	}

	public void setIn(int inval) {
		this.in = inval;
	}

	public void setOut(int outval) {
		this.out = outval;
	}

	public void setVal(int value) {
		this.val = value;
	}
}
package scaler.assigments.homework;

import java.util.ArrayList;

public class Advanced_Tries2_Assignment_Q4 {

	ArrayList<TreeNode> path = new ArrayList<TreeNode>();

	public static void main(String args[]) {

		TreeNode N1 = new TreeNode(1);
		TreeNode N2 = new TreeNode(2);
		TreeNode N3 = new TreeNode(3);
		TreeNode N6 = new TreeNode(6);
		N1.left = N6;
		N1.right = N2;
		N2.left = N3;

		new Advanced_Tries2_Assignment_Q4().solve(N1, 6, 2);

	}

	public ArrayList<Integer> solve(TreeNode A, int B, int C) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		TreeNode curr = A;
		TreeNode nodeB = findNode(curr, B);
		getPath(A, nodeB.val);

		int count = below(path.get(0), C, result);
		for(int i=1;i<path.size();i++)
		{
			if(C-i==0)
			{
				count = count+1;
				result.add(path.get(i).val);
				break;
			}
			
			if(path.get(i).left.equals(path.get(i-1)))
			{
				count+=below(path.get(i).right, C-i-1, result);
			}
			else 
			{
				count+=below(path.get(i).left, C-i-1, result);
			}
					
		}
		
		System.out.println("COUNT --> " + count);
		System.out.println("RESULT --> " + result);
		return result;
	}

	private int below(TreeNode curr, int C, ArrayList<Integer> result) {

		if (curr == null) {
			return 0;
		}

		if (C == 0) {
			result.add(curr.val);
			return 1;
		}

		int l = below(curr.left, C - 1, result);
		int r = below(curr.right, C - 1, result);

		return l + r;

	}

	boolean getPath(TreeNode root, int val) {
		if (root == null) {
			return false;
		}

		if (root.val == val) {
			path.add(root);
			return true;
		}

		if (getPath(root.left, val) || getPath(root.right, val)) {
			path.add(root);
			return true;
		}

		return false;
	}

	TreeNode findNode(TreeNode curr, int B) {

		if (curr == null)
			return null;

		if (curr.val == B)
			return curr;

		TreeNode res = findNode(curr.left, B);
		if (res == null)
			res = findNode(curr.right, B);

		return res;
	}

}

package scaler.dsa.revision.contest;

public class Q3 {

	public int isSymmetric(TreeNode A) {

		if (isMirror(A, A))
			return 1;
		else
			return 0;
	}

	boolean isMirror(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null)
			return true;

		if (node1 != null && node2 != null && node1.val == node2.val)
			return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));

		return false;
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

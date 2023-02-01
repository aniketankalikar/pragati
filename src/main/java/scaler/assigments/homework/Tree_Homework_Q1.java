package scaler.assigments.homework;

public class Tree_Homework_Q1 {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		TreeNode left4 = new TreeNode(4);
		TreeNode right5 = new TreeNode(5);
		right.left = left4;
		left4.right = right5;

		int count  = new Tree_Homework_Q1().solve(root);
		System.out.println(count);
	}

	public int solve(TreeNode A) {

		   return solveforA(A)+1; // As we have to count the root node also.
	}

	 public int solveforA(TreeNode A){
	        if(A==null)
	        return 0;
	        int count = 0;
	       if(A.left!=null){
	           if(A.left.val>A.val)
	           count++;
	           else
	           A.left.val = A.val;
	       }
	       if(A.right!=null){
	           
	           if(A.right.val>A.val)
	           count++;
	           else A.right.val = A.val;
	       }
	        return  count+solveforA(A.left)+solveforA(A.right);
	    }
}

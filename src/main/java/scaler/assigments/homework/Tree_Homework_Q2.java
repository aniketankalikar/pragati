package scaler.assigments.homework;

public class Tree_Homework_Q2 {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(9);
		TreeNode right = new TreeNode(20);
		root.left = left;
		root.right = right;
		TreeNode left4 = new TreeNode(15);
		TreeNode right5 = new TreeNode(7);
		right.left = left4;
		right.right = right5;

		int sum  = new Tree_Homework_Q2().solve(root, false);
		System.out.println(sum);
	}

	public int solve(TreeNode A, boolean isLeft) {

		if(A==null)
            return 0;

        int sum = 0;

        if(A.left == null && A.right==null && isLeft)
            sum = A.val;
        
        sum+= solve(A.left, true);
        sum+= solve(A.right,false);
        
        return sum;    
	}

	
}

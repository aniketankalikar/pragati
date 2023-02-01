package scaler.assigments.homework;

public class Tree_Assignment_Q4 {
	
	public static void main(String args[])
	{
		TreeNode root= new TreeNode(4);
		TreeNode left= new TreeNode(5);
		TreeNode right= new TreeNode(2);
		root.left = left;
		root.right = right;
		TreeNode left2= new TreeNode(3);
		TreeNode right2= new TreeNode(6);
		right.left = left2;
		right.right = right2;
		
		int height = new Tree_Assignment_Q4().solve(root);
		System.out.println(height);
	}
	
	 public int solve(TreeNode A) {
		 
		int height = height(A);
		
		return height;
	 }
	 
	 public int height(TreeNode root)
	 {
		 if(root==null)
			 return 0;
		 
		 int l = height(root.left);
		 int r = height(root.right);
	 
		 int max = l > r ? l : r;
		 
		 
		 return max+1;
	 }
	

}

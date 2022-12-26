package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree_Assignment_Q1 {


	// IN ORDER
	
	public static void main(String args[])
	{
		TreeNode head = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		head.left= left;
		head.right = right;
		TreeNode node = new TreeNode(4);
		TreeNode node1 = new TreeNode(5);
		right.left = node;
		node.right = node1;
		
		int [] res = new Tree_Assignment_Q1().inorderTraversal(head);
		System.out.println(res);
	}
	
	public int[] inorderTraversal(TreeNode A) {
		List<Integer> list = new ArrayList<Integer>();

		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode current = A;
		
		while(current!=null || s.size()>0)
		{
			while(current!=null)
			{
				s.push(current);
				current = current.left;
			}
			
			current = s.pop();
			list.add(current.val);
			current = current.right;
			
		}
		
		int [] result = new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			result[i] = list.get(i);
		}
		
		return result;
	}

}
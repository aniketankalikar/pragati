package scaler.assigments.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Trees_DSA2_Assignment2 {

	 public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
		 
		 Map<Integer, List<Integer>> mp = new HashMap<Integer, List<Integer>>();
		 Queue<CustomPair> q = new ArrayDeque<CustomPair>();
		 
		 int minLevel =0, maxLevel=0;
		 q.add(new CustomPair(A, 0));
		 
		 while(q.size()>0)
		 {
			 CustomPair front  =  q.peek();
			 q.remove();
			 TreeNode n = front.node;
			 int level = front.level;
			 
			 minLevel = level < minLevel ? level : minLevel;
			 maxLevel = level > maxLevel ? level : maxLevel;
			 
			 List<Integer> arrList = new ArrayList<Integer>();
			 arrList.add(n.val);
			 if(mp.get(level)==null )
			 {
				 mp.put(level, arrList);
			 }
			 else
			 {
				 mp.get(level).add(n.val);
			 }
			 
			 if(n.left!=null)
			 {
				 q.add(new CustomPair(n.left, level-1));
			 }

			 
			 if(n.right!=null)
			 {
				 q.add(new CustomPair(n.right, level+1));
			 }
		 }
		 
		 ArrayList<ArrayList<Integer>> final2DArr = new ArrayList<ArrayList<Integer>>();
		 if(mp!=null && mp.size()>0)
		 {
			 
			 for(int i=minLevel;i<=maxLevel;i++)
			 {
				 if (mp.get(i)!=null)
					 final2DArr.add((ArrayList<Integer>)mp.get(i));
				 
			 } 
		 }
			 
		 
		 
		 return final2DArr;
	    }
	
}

class CustomPair
{
	TreeNode node;
	int level;
	
	public CustomPair(TreeNode n, int l)
	{
		this.node = n;
		this.level = l;
	}
}
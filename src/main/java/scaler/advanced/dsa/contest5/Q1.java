package scaler.advanced.dsa.contest5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

  class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
 
public class Q1 {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,List<Integer>> mp = new HashMap<Integer,List<Integer>>();
        TreeNode root = A;
        Queue<CustomPair> q = new ArrayDeque<CustomPair>();
        int minLevel =0; int maxLevel = 0;
        CustomPair p = new CustomPair(root,0);
        q.add(p);
        
        while(q.size()>0)
        {
            CustomPair f = q.peek();
            q.remove();
            TreeNode t = f.node;
            int level = f.level;
            
            minLevel = minLevel < level ? minLevel :level;
            maxLevel = maxLevel > level ? maxLevel :level;
            List<Integer> list = new ArrayList<Integer>();
            list.add(t.val);
            if(mp.get(level) == null)
            {
                
                mp.put(level,list);
            }
            else
            {
                mp.get(level).add(t.val);   
            }
            
            if(t.left!=null)
            {
                CustomPair lft = new CustomPair(t.left,level-1);
                q.add(lft);
            }
            if(t.right!=null)
            {
                CustomPair rht = new CustomPair(t.right,level+1);
                q.add(rht);
            }
            
        }
        
        for(int i = minLevel;i <=maxLevel;i++)
        {
            if(mp.get(i)!=null)
            {
                List<Integer> inp = mp.get(i);
                if(inp!=null && inp.size()>0)
                {
                    for(int j = inp.size()-1;j >=0;j--)
                    {
                        result.add(inp.get(j));
                    }
                }
            }
        }
        
        return result;

    }
}

class CustomPair
{
    TreeNode node;
    int level;
    
    public CustomPair(TreeNode n, int l)
    {
        this.node = n;
        this.level =l;
    }
    
}
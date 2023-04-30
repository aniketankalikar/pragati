package scaler.advanced.dsa.contest6;

import java.util.ArrayList;

public class Q3 {
    
    boolean visited[][];
    public int solve(ArrayList<String> A, String B) {
        visited = new boolean [A.size()] [A.get(0).length()];
        for(int i=0;i<A.size();i++)
        {
            for(int j=0;j<A.get(0).length();j++)
            {
                if(B.charAt(0) == A.get(i).charAt(j) && search(A,B,i,j,0))
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    
    public boolean search(ArrayList<String> A, String B, int i, int j, int index)
    {
        if(index == B.length())
            return true;
        
        if(i>=A.size() || i < 0 || j >= A.get(0).length() || j < 0 || A.get(i).charAt(j)!= B.charAt(index) || visited[i][j] == true)
        {
            return false;
        }
        visited[i][j] = true;
        // Check for Left. Right and bottom
        
        if(search(A,B,i+1,j,index+1) || search(A,B,i,j+1,index+1) || search(A,B,i,j-1,index+1)  )
        {
            return true;
        }
        visited[i][j]= false;
        return false;
    }
}


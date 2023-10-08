package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;

public class Int_DSA_Arrays_Problems1_H1 {

    public static void main(String args[])
    {
        ArrayList<Integer> A = new ArrayList( List.of(5, 6, -1, 7, 8)) ;
        new Int_DSA_Arrays_Problems1_H1().solve(A);

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        int i = 0, j=0 , start = 0, end =0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(i<A.size() && j<A.size())
        {
            if(A.get(j) >= 0)
            {
                j++;
            }
            else {

                // check the size of subarray is greater
                if(j-i >  (end - start) )
                {
                    start = i; end = j;
                }
                i = j + 1; j++;
            }
       }

        if(j-i > (end - start) )
        {
            start = i; end = j;
        }

        for(int count = start;count<end;count++)
        {
            result.add(A.get(count));
        }

        System.out.println(result);

        return result;
    }
}
//[-4549634,-3196682,8455838,-1432628,-263819,-3928366,-5556259,-2114783,3923939,-4183708]

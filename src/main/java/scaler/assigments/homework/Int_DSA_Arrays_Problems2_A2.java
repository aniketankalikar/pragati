package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;

public class Int_DSA_Arrays_Problems2_A2 {

    public static void main(String args[])
    {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>();
        List<Integer> q = List.of(0,2);
        queries.add(new ArrayList<>(q));
        q = List.of(1,4);
        queries.add(new ArrayList<>(q));

        ArrayList<Integer> result = new Int_DSA_Arrays_Problems2_A2().solve(new ArrayList<>(input),queries );
        System.out.println(result);
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        int rows = B.size();

        for(int i =0;i< B.size();i++)
        {
            int startIndex = B.get(i).get(0);
            int endIndex = B.get(i).get(1);
            int sum = 0;
            while(startIndex <=endIndex)
            {
                if(startIndex%2 !=0)
                {
                    sum+=A.get(startIndex);
                }
                startIndex++;
            }
            result.add(sum);
        }

        return result;
    }
}

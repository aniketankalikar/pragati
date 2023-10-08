package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;

public class Int_DSA_Arrays_Problems1_H4 {

    public static void main(String args[])
    {
        List<Integer> A = List.of(1, 2, 3, 4, 5);
        List<Integer> B = List.of(2,3);

        ArrayList<ArrayList<Integer>> result = new Int_DSA_Arrays_Problems1_H4().solve(new ArrayList<Integer>(A), new ArrayList<Integer>(B));
        System.out.println(result);
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for(int i =0;i < B.size(); i++)
        {
            ArrayList<Integer> input = new ArrayList<Integer>(A);
            this.leftRotate(input, B.get(i));
            result.add(i, input);
        }

        return result;

    }

    public void leftRotate(ArrayList<Integer> input, int d)
    {
        if(d==0)
            return;

        int n = input.size();

        d = d % n;

        reverseList(input,0,d-1);
        reverseList(input, d, n-1);
        reverseList(input, 0 , n-1);


    }

    public void reverseList(ArrayList<Integer> input, int start, int end)
    {
        int temp;

        while(start < end)
        {
            temp = input.get(start);
            input.set(start, input.get(end));
            input.set(end, temp);
            start++;
            end --;
        }
    }
}

package scaler.advanced.dsa.cm1.revision.contest;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSumZero {

    public static void main(String args[])
    {
        List<Integer> A = List.of(-5,2,1,3);
        ArrayList<ArrayList<Integer>> result = new ThreeSumZero().threeSum( new ArrayList<>(A));
        System.out.println(result);

    }

    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();


        // sort array elements
        Collections.sort(A);
        int n = A.size();
        for (int i = 0; i < n - 1; i++) {
            // initialize left and right
            int l = i + 1;
            int r = n - 1;
            int x = A.get(i);
            while (l < r) {
                if (x + A.get(l) + A.get(r) == 0) {
                    // Add to result;
                    ArrayList<Integer> triplet =  new ArrayList<Integer>();
                    triplet.add(x);
                    triplet.add(A.get(l) );
                    triplet.add(A.get(r) );
                    if(!result.contains(triplet))
                        result.add(triplet);
                    l++;
                    r--;
                }

                // If sum of three elements is less
                // than zero then increment in left
                else if (x + A.get(l) + A.get(r) < 0)
                    l++;

                    // if sum is greater than zero then
                    // decrement in right side
                else
                    r--;
            }
        }

        return result;
    }
}

package scaler.assigments.homework;

import java.util.ArrayList;

public class Intermediate_DSA_Rotate_Matrix {

    public void solve(ArrayList<ArrayList<Integer>> A) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.get(0).size(); j++) {
                int temp = A.get(i).get(j);
                A.get(i).set(j,A.get(j).get(i)) ;
                A.get(j).set(i,temp) ;
            }
        }
        // Reverse each row
        for (int i = 0; i < A.size(); i++) {
            int l = 0; //left index
            int r = A.get(0).size() - 1; //right index (n-1)
            while (l < r) {
                int temp = A.get(i).get(l);
                A.get(i).set(l,A.get(i).get(r)) ;
                A.get(i).set(r,temp) ;
                l++;
                r--;
            }
        }

    }
}

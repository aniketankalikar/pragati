package scaler.assigments.homework;

import java.util.ArrayList;

public class Int_DSA_Arrays_Special_Index {

    public int solve(ArrayList<Integer> A) {
        int evenSum = 0;
        int oddSum = 0;
        int siCount = 0;
        int[] evenPF = new int[A.size()];
        int[] oddPF = new int[A.size()];

        evenPF[0] = A.get(0);
        oddPF[0] = 0;

        for (int i = 1; i < A.size(); i++) {
            if (i % 2 == 0) {
                evenPF[i] = evenPF[i - 1] + A.get(i);
                oddPF[i] = oddPF[i - 1];
            } else {
                oddPF[i] = oddPF[i - 1] + A.get(i);
                evenPF[i] = evenPF[i - 1];
            }
        }

        for (int i = 0; i < A.size(); i++) {
            if (i == 0) {
                evenSum = oddPF[A.size() - 1];
                oddSum = evenPF[A.size() - 1];
            } else {
                evenSum = evenPF[i - 1] + (oddPF[A.size() - 1] - oddPF[i]);
                oddSum = oddPF[i - 1] + (evenPF[A.size() - 1] - evenPF[i]);
            }
            if (evenSum == oddSum) {
                siCount++;
            }
        }
        return siCount;
    }

}


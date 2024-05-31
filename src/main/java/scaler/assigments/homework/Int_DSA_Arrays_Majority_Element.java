package scaler.assigments.homework;

import java.util.List;

public class Int_DSA_Arrays_Majority_Element {

    public int majorityElement(final List<Integer> A) {

        int count = 0, freqValue = 0, n = A.size();

        for (int i = 0; i < n; i++) {

            if (count == 0) freqValue = A.get(i);

            if (freqValue == A.get(i))
                count++;
            else
                count--;
        }
        return freqValue;
    }
}

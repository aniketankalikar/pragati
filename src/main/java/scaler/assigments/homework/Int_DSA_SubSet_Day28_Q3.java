package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Int_DSA_SubSet_Day28_Q3 {

    public int[][] subsets(int[] A) {

        List<Integer> inputList = Arrays.stream(A).boxed().collect(Collectors.toList());
        ArrayList<ArrayList<Integer>> resList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;
        resList.add(new ArrayList<Integer>());
        Collections.sort(inputList);
        checkSubsets((ArrayList<Integer>) inputList, index, list,resList);

        int[][] res = resList.stream().map(x -> x.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
        return res;
    }

    public void checkSubsets(ArrayList<Integer> inputArr, int index, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> resList ){
        if(index == inputArr.size()){
            return;
        }
        //To-Include
        list.add(inputArr.get(index));
        resList.add(new ArrayList<Integer>(list));
        checkSubsets(inputArr,index+1,list,resList);

        //To-Exclude
        list.remove(list.size()-1);
        checkSubsets(inputArr,index+1,list,resList);
    }

}

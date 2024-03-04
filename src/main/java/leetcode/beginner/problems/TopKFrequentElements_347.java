package leetcode.beginner.problems;

import java.util.*;

public class TopKFrequentElements_347 {

    public static void main(String args[])
    {
        int [] nums = {1,1,1,2,2,3};
        int k = 2;

        int res  [] = new TopKFrequentElements_347().topKFrequent(nums,k);
        System.out.println(res);

        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> mpInput = new HashMap<>();
        // Build the Map
        for(int i=0;i<nums.length;i++)
        {
            if(mpInput.get(nums[i])!=null)
            {
                int val = mpInput.get(nums[i]) ;
                val++;
                mpInput.put(nums[i], val);
            }
            else
            {
                mpInput.put(nums[i], 1);
            }
        }

        Object [] objArr = new Object[nums.length+1];

        for(Map.Entry<Integer,Integer> entry: mpInput.entrySet())
        {
            Integer key = entry.getKey();
            Integer val = entry.getValue();

            if(objArr[val] == null )
            {
                Set<Integer> arrSet = new HashSet<>();
                arrSet.add(key);
                objArr[val] = arrSet;

            }
            else
            {
                Set<Integer> arrSet = (Set<Integer>)objArr[val];
                arrSet.add(key);
                objArr[val] = arrSet;
            }
        }

        int counter=0;

        if(objArr!=null && objArr.length>0)
        {
            int len = objArr.length;
            for(int j=len-1;j>=0;j--)
            {
                if(res.size() == k)
                    break;
                Set<Integer> arrSet = (HashSet<Integer> ) objArr[j];
                if(arrSet!=null && arrSet.size()>0)
                {
                    Object [] tmpArr = arrSet.toArray();
                    for(int i =0; i< tmpArr.length;i++)
                    {
                        res.add((Integer) tmpArr[i]) ;
                        counter++;
                    }
                }
            }
        }

        int[] resArr = res.stream().mapToInt(i -> i).toArray();

        return resArr;
    }
}

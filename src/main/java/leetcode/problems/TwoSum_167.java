package leetcode.problems;

public class TwoSum_167 {

    public static void main(String args[])
    {
        int [] input = {-1,0};
        int target = -1;

        int res [] = new TwoSum_167().twoSum(input, target);

        System.out.println("result -->  "+res[0]+" "+res[1]);

    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i=0;
        int j = numbers.length-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j] == target)
            {
                result[0] = i+1;
                result[1] = j+1;
                break;
            }
            else if(numbers[i]+numbers[j] > target)
            {
                j--;
            }
            else if(numbers[i]+numbers[j] < target)
            {
                i++;
            }
        }

        return result;
    }


}
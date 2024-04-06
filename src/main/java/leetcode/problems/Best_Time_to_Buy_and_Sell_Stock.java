package leetcode.problems;

public class Best_Time_to_Buy_and_Sell_Stock {


    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4};
        int res = new Best_Time_to_Buy_and_Sell_Stock().maxProfit(arr);
        System.out.println("Result "+res);
    }
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxprof = 0;

        for(int i=1;i<prices.length;i++){
            maxprof = Math.max(maxprof,prices[i]-min_price);
            min_price = Math.min(prices[i],min_price);
        }

        return maxprof;
    }
}

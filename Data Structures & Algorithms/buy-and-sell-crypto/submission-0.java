class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,minI=Integer.MAX_VALUE;
        for(int i : prices)
        {
            if(i<minI)
            {
                minI=Math.min(minI,i);
            }
            else{
                int currentProfit=i-minI;
                profit=Math.max(currentProfit,profit);
            }
        }
        return profit;
    }
}

class Solution {
    public int recCall(int amount, int n, int[] coins, int[][] dp)
    {
         if(amount==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n][amount]!=-1)
        {
            return dp[n][amount];
        }

        int take=0;
        if(amount>=coins[n])
        {
            take=recCall(amount-coins[n], n, coins, dp);
        }

        int notTake= recCall(amount, n-1, coins, dp);

        return dp[n][amount]=take+notTake;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];

        for(int i=0;i<coins.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
       
       return recCall(amount, coins.length-1, coins ,dp);


        
    }
}

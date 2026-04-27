class Solution {
    public int recCall(int n, int amount, int[] coins, int[][] dp)
    {
        if(n<0)
        {
            return Integer.MAX_VALUE;
        }
        if(amount==0)
        {
            return 0;
        }

        if(dp[n][amount]!=-1)
        {
            return dp[n][amount];
        }


        int take=Integer.MAX_VALUE;
        if(coins[n]<=amount)
        {
            int sub = recCall(n, amount - coins[n], coins, dp);
            if (sub != Integer.MAX_VALUE) {
            take = sub + 1;
    }
        }
        int notTake=recCall(n-1, amount, coins ,dp);

        return dp[n][amount] = Math.min(take, notTake);


    }
    public int coinChange(int[] coins, int amount) {

        int[][] dp = new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }

        int ans = recCall(coins.length-1, amount, coins, dp);
        return ans>=Integer.MAX_VALUE?-1:ans;
        
    }
}

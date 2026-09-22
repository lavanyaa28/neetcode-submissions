class Solution {

    public int recCall(int[] cost, int i,int[] dp)
    {
        if(i==cost.length || i>cost.length)
        {
            return 0;
        }
        if(dp[i] != -1)
        {
            return dp[i];
        }

        int s1 = recCall(cost, i+1,dp);
        int s2 = recCall(cost, i+2,dp);

        return dp[i]= cost[i]+Math.min(s1,s2);

    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);

        int s1 = recCall(cost, 0,dp);
        int s2 = recCall(cost, 1,dp);
        return Math.min(s1,s2);
                
    }
}

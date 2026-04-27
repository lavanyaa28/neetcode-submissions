class Solution {
    public int recCall(int[] nums, int i, int[] dp)
    {
        if(i==0)
        {
            return 1;
        }

        if(dp[i]!=-1)
        {
            return dp[i];
        }

        int mx=1;

        for(int prev=0;prev<i; prev++)
        {
            if(nums[prev]<nums[i])
            {
                mx=Math.max(mx, recCall(nums,prev,dp)+1);
            }
        }

        return dp[i]=mx;
    }
    public int lengthOfLIS(int[] nums) {

        int[] dp= new int[nums.length];
        Arrays.fill(dp,-1);
        int res=1;
        for(int i=0;i<nums.length;i++)
        {
            res=Math.max(res,recCall(nums, i, dp));
        }
        
        return res;
        
    }
}

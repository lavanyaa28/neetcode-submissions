class Solution {
    public int jump(int[] nums) {
        // dp array
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }
        // last element set to true
        dp[nums.length-1]=0;

        // for loop --> n-1 to 0
        for(int i=nums.length-2;i>=0;i--)
        {
            int k=nums[i];
            if(k==0)
            {
                dp[i]=0;
                continue;
            }

            if(i+k>=nums.length-1)
            {
                dp[i]=1;
                continue;
            }
            for(int jumps=nums[i];jumps>=1;jumps--)
            {
                if (dp[i + jumps] != Integer.MAX_VALUE && dp[i+jumps]!=0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i + jumps]);
                }
            }
        }
        return dp[0];
    }
}

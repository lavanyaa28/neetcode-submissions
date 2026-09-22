class Solution {
    public int recCall(int[] nums, int i, int[] dp)
    {
        if(i>= nums.length)
        {
            return 0;
        }

        if(dp[i] != -1)
        {
            return dp[i];
        }
        
        int s1 = nums[i] + recCall(nums, i+2, dp);
        int s2 = recCall(nums, i+1, dp);

        return dp[i]= Math.max(s1, s2);
    }
    public int rob(int[] nums) {

        int[] dp = new int[nums.length];

        Arrays.fill(dp,-1);

        return recCall(nums, 0, dp);


        
    }
}

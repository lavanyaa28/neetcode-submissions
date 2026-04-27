class Solution {
    public boolean canJump(int[] nums) {
        // dp array
        boolean[] dp=new boolean[nums.length];
        // last element set to true
        dp[nums.length-1]=true;

        // for loop --> n-1 to 0
        for(int i=nums.length-2;i>=0;i--)
        {
            // calculate jumps
            int jumps=nums[i];
            
            // if after taking the longest plunge we cross the array then put dp[i] = true
            if(jumps + i >= nums.length-1)
            {
                dp[i]=true;
                continue;
            }

            // if before reaching the end of the array i.e., n-1th index then put dp[i] = false

            else if(nums[i]==0 && i < nums.length-1)
            {
                dp[i]=false;
                continue;
            }

            // if above 2 conditions do not match then we use the next one

            for(int k=1;k<=nums[i];k++)
            {
                if(dp[i+k]==true)
                {
                    dp[i]=true;
                    continue;
                }
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            System.out.println(dp[i]);
        }
        return dp[0];
    }
}

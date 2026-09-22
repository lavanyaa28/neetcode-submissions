    class Solution {
        public int recCall(int[] nums , int i, int st, int[] dp)
        {
            if(i > st)
            {
                return 0;
            }

            if(dp[i] != -1)
            {
                return dp[i];
            }

            int s1 = nums[i] + recCall(nums, i+2,st, dp);
            int s2 = recCall(nums, i+1,st, dp);
            return dp[i]=Math.max(s1, s2);
        }
        public int rob(int[] nums) {

            if(nums.length == 1)
            {
                return nums[0];
            }

            int[] dp = new int[nums.length];
            Arrays.fill(dp,-1);
            int s1 = recCall(nums, 0, nums.length-2, dp);
            Arrays.fill(dp,-1);
            int s2 = recCall(nums,1,nums.length-1,dp);

            return Math.max(s1,s2);
            
        }
    }

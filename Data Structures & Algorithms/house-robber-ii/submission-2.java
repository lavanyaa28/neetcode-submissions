class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1)
        {
            return nums[0];
        }

        if(nums.length==0)
        {
            return 0;
        }

        int[] memo1 = new int[nums.length];
        int[] memo2 = new int[nums.length];

        Arrays.fill(memo1,-1);
        Arrays.fill(memo2,-1);

        return Math.max(robHelper(0,nums.length-1, memo1, nums), robHelper(1, nums.length,memo2,nums));



        
    }

    public int robHelper(int i, int n, int[] memo, int[] nums)
    {
        if(i>=n)
        {
            return 0;
        }

        if(memo[i]!=-1)
        {
            return memo[i];
        }
        int include = nums[i] + robHelper(i+2, n,  memo, nums);
        int notInclude = robHelper(i+1, n, memo, nums);
        return memo[i]= Math.max(include, notInclude);
    }
}
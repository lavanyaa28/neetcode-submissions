class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length+1];
        Arrays.fill(memo,-1);

        return robHelper(0, memo, nums);

        
    }
    public int robHelper(int i, int[] memo, int[] nums)
    {
        if(i >= nums.length)
        {
            return 0;
        }

        if(memo[i]!=-1)
        {
            return memo[i];
        }

        int include = nums[i] + robHelper(i+2, memo, nums);
        int notInclude = robHelper(i+1, memo, nums);
        return memo[i]=Math.max(include, notInclude);

    }
}

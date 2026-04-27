class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length==1)
        // {
        //     return nums[0];
        // }

        // int sum=0;
        // int lastSum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     sum+=nums[i];
        //     lastSum=Math.max(sum,lastSum);
        //     if(sum<0)
        //     {
        //         sum=0;
        //     }
        // }
        // lastSum=Math.max(sum,lastSum);
        // return lastSum;
        int maxCurrent = nums[0];
    int maxGlobal = nums[0];

    for (int i = 1; i < nums.length; i++) {
        maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
        maxGlobal = Math.max(maxGlobal, maxCurrent);
    }

    return maxGlobal;
        
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0, conOne =0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                conOne++;
            }
            else{
                if(maxOne<conOne)
                {
                    maxOne = conOne;
                }
                conOne = 0;
                
            }
        }
        if(maxOne<conOne)
            {
                maxOne = conOne;
            }
        return maxOne;
    }
}
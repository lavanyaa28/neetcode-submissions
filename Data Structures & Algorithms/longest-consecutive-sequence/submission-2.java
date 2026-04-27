class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        // -1,-1,0,1,3,4,5,6,7,8,9
        int count=1;
        int longestCount=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                System.out.println("continue"+count);
                continue;
            }
            if(nums[i]==(nums[i-1]+1) )
            {
                System.out.println(count);
                count++;
            }
            else{
                longestCount=Math.max(longestCount,count);
                count=1;
            }
        }
        longestCount=Math.max(longestCount,count);
        return longestCount;        
    }
}

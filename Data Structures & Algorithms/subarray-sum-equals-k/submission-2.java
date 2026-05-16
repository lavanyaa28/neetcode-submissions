class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0, currSum=0;

        HashMap<Integer, Integer> count = new HashMap<>();

        count.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
            currSum+=nums[i];

            int diff = currSum - k;

            if(count.containsKey(diff))
            {
                ans+=count.get(diff);
            }


            count.put(currSum, count.getOrDefault(currSum, 0)+1);
        }


        return ans;
        
    }
}